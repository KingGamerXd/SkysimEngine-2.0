/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.entity;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.Rarity;
import vn.giakhanhvn.skysim.features.item.SkullStatistics;

public class BS4
implements SkullStatistics,
MaterialFunction {
    @Override
    public String getURL() {
        return "76387fc246893d92a6dd9ea1b52dcd581e991eeee2e263b27fff1bcf1b154eb7";
    }

    @Override
    public String getDisplayName() {
        return "BZB4";
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

