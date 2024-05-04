/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.accessory;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.Rarity;
import vn.giakhanhvn.skysim.features.item.SpecificItemType;
import vn.giakhanhvn.skysim.features.item.accessory.AccessoryStatistics;

public class InfiniteCritTalisman
implements AccessoryStatistics,
MaterialFunction {
    @Override
    public String getURL() {
        return "ddafb23efc57f251878e5328d11cb0eef87b79c87b254a7ec72296f9363ef7c";
    }

    @Override
    public String getDisplayName() {
        return "Infinite Crit Talisman";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EXCLUSIVE;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ACCESSORY;
    }

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.ACCESSORY;
    }

    @Override
    public double getBaseCritChance() {
        return 1.0;
    }
}

