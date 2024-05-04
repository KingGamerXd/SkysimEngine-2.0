/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Sound
 *  org.bukkit.entity.Player
 */
package vn.giakhanhvn.skysim.features.item.weapon;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import vn.giakhanhvn.skysim.features.item.Ability;
import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.Rarity;
import vn.giakhanhvn.skysim.features.item.SItem;
import vn.giakhanhvn.skysim.features.item.SpecificItemType;
import vn.giakhanhvn.skysim.features.item.ToolStatistics;

public class AspectOfTheJerry
implements ToolStatistics,
MaterialFunction,
Ability {
    @Override
    public String getAbilityName() {
        return "Parley";
    }

    @Override
    public String getAbilityDescription() {
        return "Release your inner Jerry.";
    }

    @Override
    public int getAbilityCooldownTicks() {
        return 100;
    }

    @Override
    public void onAbilityUse(Player player, SItem sItem) {
        player.playSound(player.getLocation(), Sound.VILLAGER_IDLE, 1.0f, 1.0f);
    }

    @Override
    public int getManaCost() {
        return 0;
    }

    @Override
    public String getDisplayName() {
        return "Aspect of the Jerry";
    }

    @Override
    public int getBaseDamage() {
        return 1;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.WEAPON;
    }

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.SWORD;
    }
}

