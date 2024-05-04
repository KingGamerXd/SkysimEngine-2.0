/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.accessory;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.PlayerBoostStatistics;
import vn.giakhanhvn.skysim.features.item.Reforgable;
import vn.giakhanhvn.skysim.features.item.SkullStatistics;
import vn.giakhanhvn.skysim.features.item.SpecificItemType;

public interface AccessoryStatistics
extends PlayerBoostStatistics,
SkullStatistics,
Reforgable {
    @Override
    default public GenericItemType getType() {
        return GenericItemType.ACCESSORY;
    }

    @Override
    default public SpecificItemType getSpecificType() {
        return SpecificItemType.ACCESSORY;
    }
}

