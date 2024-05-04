/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.tarantula;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.MaterialStatistics;
import vn.giakhanhvn.skysim.features.item.Rarity;

public class TarantulaWeb
implements MaterialStatistics,
MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Tarantula Web";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
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

