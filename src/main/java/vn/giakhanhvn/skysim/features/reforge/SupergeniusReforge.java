/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.reforge;

import vn.giakhanhvn.skysim.features.item.RarityValue;
import vn.giakhanhvn.skysim.features.reforge.Reforge;

public class SupergeniusReforge
implements Reforge {
    @Override
    public String getName() {
        return "Supergenius";
    }

    @Override
    public RarityValue<Double> getIntelligence() {
        return RarityValue.singleDouble(1000000.0);
    }
}

