/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.armor.miner;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.Rarity;
import vn.giakhanhvn.skysim.features.item.SpecificItemType;
import vn.giakhanhvn.skysim.features.item.armor.LeatherArmorStatistics;

public class MinerLeggings
implements LeatherArmorStatistics,
MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Miner Leggings";
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
        return SpecificItemType.LEGGINGS;
    }

    @Override
    public double getBaseDefense() {
        return 5.0;
    }

    @Override
    public int getColor() {
        return 255;
    }
}

