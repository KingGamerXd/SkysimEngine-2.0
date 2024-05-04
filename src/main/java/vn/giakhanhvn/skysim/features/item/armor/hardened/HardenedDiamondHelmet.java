/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.armor.hardened;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.Rarity;
import vn.giakhanhvn.skysim.features.item.SpecificItemType;
import vn.giakhanhvn.skysim.features.item.ToolStatistics;

public class HardenedDiamondHelmet
implements ToolStatistics,
MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Hardened Diamond Helmet";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ARMOR;
    }

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.HELMET;
    }

    @Override
    public double getBaseDefense() {
        return 60.0;
    }
}

