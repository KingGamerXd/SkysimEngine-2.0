/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.dragon.young;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.Rarity;
import vn.giakhanhvn.skysim.features.item.SkullStatistics;
import vn.giakhanhvn.skysim.features.item.SpecificItemType;
import vn.giakhanhvn.skysim.features.item.ToolStatistics;

public class YoungDragonHelmet
implements MaterialFunction,
SkullStatistics,
ToolStatistics {
    @Override
    public double getBaseSpeed() {
        return 0.2;
    }

    @Override
    public double getBaseHealth() {
        return 70.0;
    }

    @Override
    public double getBaseDefense() {
        return 110.0;
    }

    @Override
    public String getURL() {
        return "5c486af3b882766e82a0bc1665ff02eb6e873b6e0d771f3adabc759b720226a";
    }

    @Override
    public String getDisplayName() {
        return "Young Dragon Helmet";
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
        return SpecificItemType.HELMET;
    }

    @Override
    public String getLore() {
        return null;
    }
}

