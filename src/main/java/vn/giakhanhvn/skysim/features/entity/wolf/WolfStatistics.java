/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.entity.wolf;

import vn.giakhanhvn.skysim.features.entity.Ageable;
import vn.giakhanhvn.skysim.features.entity.EntityStatistics;

public interface WolfStatistics
extends EntityStatistics,
Ageable {
    default public boolean isAngry() {
        return false;
    }
}

