/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.tarantula;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.Rarity;
import vn.giakhanhvn.skysim.features.item.SkullStatistics;

public class SpiderCatalyst
implements SkullStatistics,
MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Spider Catalyst";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ITEM;
    }

    @Override
    public String getURL() {
        return "983b30e9d135b05190eea2c3ac61e2ab55a2d81e1a58dbb26983a14082664";
    }
}

