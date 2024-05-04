/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.armor.eleganttux;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.Rarity;
import vn.giakhanhvn.skysim.features.item.SpecificItemType;
import vn.giakhanhvn.skysim.features.item.armor.LeatherArmorStatistics;

public class ElegantTuxChestplate
implements LeatherArmorStatistics,
MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Elegant Tuxedo Jacket";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ARMOR;
    }

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.CHESTPLATE;
    }

    @Override
    public double getBaseCritDamage() {
        return 1.0;
    }

    @Override
    public double getBaseIntelligence() {
        return 300.0;
    }

    @Override
    public int getColor() {
        return 0x191919;
    }
}

