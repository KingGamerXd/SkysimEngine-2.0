/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.reforge;

import vn.giakhanhvn.skysim.features.item.RarityValue;
import vn.giakhanhvn.skysim.features.reforge.Reforge;

public class Attackery
implements Reforge {
    @Override
    public String getName() {
        return "Attackery";
    }

    @Override
    public RarityValue<Double> getAttackSpeed() {
        return RarityValue.singleDouble(20.0);
    }
}

