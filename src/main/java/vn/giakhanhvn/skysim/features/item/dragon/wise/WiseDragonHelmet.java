/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.dragon.wise;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.Rarity;
import vn.giakhanhvn.skysim.features.item.SkullStatistics;
import vn.giakhanhvn.skysim.features.item.SpecificItemType;
import vn.giakhanhvn.skysim.features.item.ToolStatistics;

public class WiseDragonHelmet
implements MaterialFunction,
SkullStatistics,
ToolStatistics {
    @Override
    public double getBaseIntelligence() {
        return 125.0;
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
        return "5a2984cf07c48da9724816a8ff0864bc68bce694ce8bd6db2112b6ba031070de";
    }

    @Override
    public String getDisplayName() {
        return "Wise Dragon Helmet";
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

