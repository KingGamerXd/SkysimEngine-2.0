/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.oddities;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.MaterialStatistics;
import vn.giakhanhvn.skysim.features.item.Rarity;

public class Bedrock
implements MaterialStatistics,
MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Bedrock";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.BLOCK;
    }

    @Override
    public String getLore() {
        return "How do you have this??";
    }
}

