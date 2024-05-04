/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.entity;

import vn.giakhanhvn.skysim.features.entity.EntityStatistics;

public interface SlimeStatistics
extends EntityStatistics {
    default public int getSize() {
        return 1;
    }

    default public boolean split() {
        return false;
    }
}

