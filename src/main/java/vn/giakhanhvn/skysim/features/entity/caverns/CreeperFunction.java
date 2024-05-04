/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.entity.caverns;

import vn.giakhanhvn.skysim.features.entity.EntityFunction;
import vn.giakhanhvn.skysim.features.entity.SEntity;
import vn.giakhanhvn.skysim.event.CreeperIgniteEvent;

public interface CreeperFunction
extends EntityFunction {
    default public void onCreeperIgnite(CreeperIgniteEvent e, SEntity sEntity) {
    }
}

