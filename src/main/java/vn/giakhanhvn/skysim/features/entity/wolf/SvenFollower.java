/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.entity.wolf;

import java.util.Collections;
import java.util.List;
import vn.giakhanhvn.skysim.features.entity.EntityDrop;
import vn.giakhanhvn.skysim.features.entity.EntityDropType;
import vn.giakhanhvn.skysim.features.entity.wolf.BaseWolf;
import vn.giakhanhvn.skysim.features.item.SItem;
import vn.giakhanhvn.skysim.features.item.SMaterial;
import vn.giakhanhvn.skysim.util.SUtil;

public class SvenFollower
extends BaseWolf {
    @Override
    public String getEntityName() {
        return "Pack Enforcer";
    }

    @Override
    public double getEntityMaxHealth() {
        return 120000.0;
    }

    @Override
    public double getDamageDealt() {
        return 1100.0;
    }

    @Override
    public List<EntityDrop> drops() {
        return Collections.singletonList(new EntityDrop(SUtil.setStackAmount(SItem.of(SMaterial.WOLF_TOOTH).getStack(), 2), EntityDropType.GUARANTEED, 1.0));
    }

    @Override
    public double getXPDropped() {
        return 250.0;
    }

    @Override
    public boolean isAngry() {
        return true;
    }
}

