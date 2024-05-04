/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.reforge;

import vn.giakhanhvn.skysim.features.item.RarityValue;
import vn.giakhanhvn.skysim.features.reforge.Reforge;

public class GeniusReforge
implements Reforge {
    @Override
    public String getName() {
        return "Genius";
    }

    @Override
    public RarityValue<Double> getIntelligence() {
        return RarityValue.singleDouble(10000.0);
    }
}

