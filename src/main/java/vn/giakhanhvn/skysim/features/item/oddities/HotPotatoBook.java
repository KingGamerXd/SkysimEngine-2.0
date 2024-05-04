/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.oddities;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.MaterialStatistics;
import vn.giakhanhvn.skysim.features.item.Rarity;

public class HotPotatoBook
implements MaterialStatistics,
MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Hot Potato Book";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
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
        return "Combine this Book in an Anvil with a weapon or armor piece to gain a small but permanent stat boost!";
    }

    @Override
    public boolean isStackable() {
        return false;
    }
}

