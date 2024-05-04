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

public class DarkGoggles
implements MaterialFunction,
SkullStatistics,
ToolStatistics {
    @Override
    public double getBaseIntelligence() {
        return 150.0;
    }

    @Override
    public double getBaseDefense() {
        return 0.0;
    }

    @Override
    public String getURL() {
        return "29319525825f1f30727eb940d3a06426bc4cec07fbd80af5cd146e3eb3879f68";
    }

    @Override
    public String getDisplayName() {
        return "Dark Goggles";
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
}

