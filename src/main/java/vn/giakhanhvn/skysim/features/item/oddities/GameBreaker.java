/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.oddities;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.MaterialStatistics;
import vn.giakhanhvn.skysim.features.item.Rarity;

public class GameBreaker
implements MaterialStatistics,
MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Game Breaker";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ITEM;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public String getLore() {
        return "This item was given to a player who reported a game breaking exploit. What a guy!";
    }

    @Override
    public boolean isStackable() {
        return false;
    }
}

