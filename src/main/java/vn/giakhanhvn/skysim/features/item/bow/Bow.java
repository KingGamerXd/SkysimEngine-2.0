/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.bow;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.Rarity;
import vn.giakhanhvn.skysim.features.item.SpecificItemType;
import vn.giakhanhvn.skysim.features.item.ToolStatistics;
import vn.giakhanhvn.skysim.features.item.bow.BowFunction;

public class Bow
implements ToolStatistics,
BowFunction {
    @Override
    public String getDisplayName() {
        return "Bow";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getBaseDamage() {
        return 30;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.RANGED_WEAPON;
    }

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.BOW;
    }
}

