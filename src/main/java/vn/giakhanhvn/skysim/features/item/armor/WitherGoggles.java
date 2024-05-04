/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.armor;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.Rarity;
import vn.giakhanhvn.skysim.features.item.SkullStatistics;
import vn.giakhanhvn.skysim.features.item.SpecificItemType;
import vn.giakhanhvn.skysim.features.item.ToolStatistics;

public class WitherGoggles
implements MaterialFunction,
SkullStatistics,
ToolStatistics {
    @Override
    public double getBaseIntelligence() {
        return 200.0;
    }

    @Override
    public double getBaseDefense() {
        return 0.0;
    }

    @Override
    public String getURL() {
        return "37ceb8f0758e2d8ac49de6f977603c7bfc23fd82a8574810a45f5e97c6436d79";
    }

    @Override
    public String getDisplayName() {
        return "Wither Goggles";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ARMOR;
    }

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.HELMET;
    }
}

