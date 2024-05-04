/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.dragon.wise;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.Rarity;
import vn.giakhanhvn.skysim.features.item.SkullStatistics;

public class WiseDragonFragment
implements SkullStatistics,
MaterialFunction {
    @Override
    public String getURL() {
        return "1d7620b2e4934963bb12508310d05494c067dc33e008cecf2cd7b4549654fab3";
    }

    @Override
    public String getDisplayName() {
        return "Wise Dragon Fragment";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ITEM;
    }
}

