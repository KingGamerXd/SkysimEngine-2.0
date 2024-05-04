/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.orb;

public interface OrbBuff {
    public String getBuffName();

    public String getBuffDescription();

    default public String getCustomOrbName() {
        return null;
    }
}

