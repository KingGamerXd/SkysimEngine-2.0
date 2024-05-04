/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.oddities;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.MaterialStatistics;
import vn.giakhanhvn.skysim.features.item.Rarity;

public class CrystalFragment
implements MaterialStatistics,
MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Crystal Fragment";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ITEM;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }
}

