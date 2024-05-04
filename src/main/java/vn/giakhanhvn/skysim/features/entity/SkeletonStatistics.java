/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.entity;

import vn.giakhanhvn.skysim.features.entity.EntityStatistics;

public interface SkeletonStatistics
extends EntityStatistics {
    default public boolean isWither() {
        return false;
    }
}

