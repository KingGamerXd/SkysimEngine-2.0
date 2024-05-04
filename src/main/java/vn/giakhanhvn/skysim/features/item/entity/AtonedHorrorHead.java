/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.entity;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.Rarity;
import vn.giakhanhvn.skysim.features.item.SkullStatistics;

public class AtonedHorrorHead
implements SkullStatistics,
MaterialFunction {
    @Override
    public String getURL() {
        return "2b0aad2f4f06d2e0ca83c5462460065fc4a0d3093ab67c564a5ae5d89dbf02b4";
    }

    @Override
    public String getDisplayName() {
        return "Atoned Horror Head";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EXCLUSIVE;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ARMOR;
    }
}

