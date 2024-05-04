/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.inventory.ItemStack
 */
package vn.giakhanhvn.skysim.features.item;

import java.util.*;

import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import vn.giakhanhvn.skysim.features.item.MaterialQuantifiable;
import vn.giakhanhvn.skysim.features.item.SItem;
import vn.giakhanhvn.skysim.features.item.SMaterial;
import vn.giakhanhvn.skysim.features.item.ShapedRecipe;
import vn.giakhanhvn.skysim.features.item.ShapelessRecipe;
import vn.giakhanhvn.skysim.util.Groups;

public abstract class Recipe<T> {
    protected static final List<List<SMaterial>> EXCHANGEABLES = new ArrayList<>(Arrays.asList(Arrays.asList(SMaterial.OAK_WOOD, SMaterial.SPRUCE_WOOD, SMaterial.BIRCH_WOOD, SMaterial.JUNGLE_WOOD, SMaterial.ACACIA_WOOD, SMaterial.DARK_OAK_WOOD), Arrays.asList(SMaterial.OAK_WOOD_PLANKS, SMaterial.SPRUCE_WOOD_PLANKS, SMaterial.BIRCH_WOOD_PLANKS, SMaterial.JUNGLE_WOOD_PLANKS, SMaterial.ACACIA_WOOD_PLANKS, SMaterial.DARK_OAK_WOOD_PLANKS)));
    protected SItem result;
    @Setter
    protected boolean useExchangeables;

    protected Recipe(SItem result, boolean useExchangeables) {
        this.result = result;
        this.useExchangeables = useExchangeables;
    }

    protected Recipe(SItem result) {
        this(result, false);
    }

    public abstract T setResult(SItem var1);

    public abstract List<MaterialQuantifiable> getIngredients();

    public static Recipe<?> parseRecipe(ItemStack[] stacks) {
        ShapedRecipe shaped = ShapedRecipe.parseShapedRecipe(stacks);
        if (shaped != null) {
            return shaped;
        }
        return ShapelessRecipe.parseShapelessRecipe(stacks);
    }

    protected static MaterialQuantifiable[][] airless(MaterialQuantifiable[][] grid) {
        ArrayList<Integer> excluded = new ArrayList<Integer>(0);
        for (int i = 0; i < grid.length; ++i) {
            boolean ex = true;
            for (MaterialQuantifiable material : grid[i]) {
                if (material.getMaterial() == SMaterial.AIR) continue;
                ex = false;
                break;
            }
            if (!ex) continue;
            excluded.add(i);
        }
        int amountExcluded = excluded.size();
        MaterialQuantifiable[][] g = new MaterialQuantifiable[grid.length - amountExcluded][];
        int b = 0;
        for (int i = 0; i < grid.length; ++i) {
            if (excluded.contains(i)) {
                ++b;
                continue;
            }
            MaterialQuantifiable[] line = grid[i];
            int remaining = (int)Arrays.stream(line).filter(mat -> mat.getMaterial() != SMaterial.AIR).count();
            g[i - b] = new MaterialQuantifiable[remaining];
            int r = 0;
            for (int j = 0; j < line.length; ++j) {
                if (line[j].getMaterial() == SMaterial.AIR) continue;
                g[i - b][r] = line[j];
                ++r;
            }
        }
        return g;
    }

    public static List<SMaterial> getExchangeablesOf(SMaterial material) {
        for (List<SMaterial> materials : EXCHANGEABLES) {
            int f = Collections.binarySearch(materials, material);
            if (f < 0) continue;
            return materials;
        }
        return null;
    }

    public static void initializeRecipes(){
        for (Iterator<org.bukkit.inventory.Recipe> it = Bukkit.recipeIterator(); it.hasNext(); ) {
            org.bukkit.inventory.Recipe recipe = it.next();
            if (recipe.getResult() == null) continue;
            Material result = recipe.getResult().getType();
            if (recipe instanceof org.bukkit.inventory.ShapedRecipe) {
                org.bukkit.inventory.ShapedRecipe shaped = (org.bukkit.inventory.ShapedRecipe) recipe;
                ShapedRecipe specShaped = new ShapedRecipe(SItem.convert(shaped.getResult()), Groups.EXCHANGEABLE_RECIPE_RESULTS.contains(result)).shape(shaped.getShape());
                for (Map.Entry<Character , ItemStack> entry : shaped.getIngredientMap().entrySet()) {
                    if (entry.getValue() == null) continue;
                    ItemStack stack = entry.getValue();
                    specShaped.set(entry.getKey(), SMaterial.getSpecEquivalent(stack.getType(), stack.getDurability()), stack.getAmount());
                }
            }
            if (!(recipe instanceof org.bukkit.inventory.ShapelessRecipe)) continue;
            org.bukkit.inventory.ShapelessRecipe shapeless = (org.bukkit.inventory.ShapelessRecipe) recipe;
            ShapelessRecipe specShapeless = new ShapelessRecipe(SItem.convert(shapeless.getResult()), Groups.EXCHANGEABLE_RECIPE_RESULTS.contains(result));
            for (ItemStack itemStack : shapeless.getIngredientList()) {
                specShapeless.add(SMaterial.getSpecEquivalent(itemStack.getType(), itemStack.getDurability()), itemStack.getAmount());
            }
        }
    }

    public SItem getResult() {
        return this.result;
    }

    public boolean isUseExchangeables() {
        return this.useExchangeables;
    }

}

