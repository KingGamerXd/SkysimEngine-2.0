/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.entity;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.Rarity;
import vn.giakhanhvn.skysim.features.item.SkullStatistics;

public class BS5
implements SkullStatistics,
MaterialFunction {
    @Override
    public String getURL() {
        return "f868e6a5c4a445d60a3050b5bec1d37af1b25943745d2d479800c8436488065a";
    }

    @Override
    public String getDisplayName() {
        return "BZB5";
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

