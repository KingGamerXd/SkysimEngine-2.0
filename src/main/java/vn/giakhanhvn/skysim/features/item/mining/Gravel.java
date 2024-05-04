/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.mining;

import vn.giakhanhvn.skysim.features.item.ExperienceRewardStatistics;
import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.Rarity;
import vn.giakhanhvn.skysim.features.skill.MiningSkill;
import vn.giakhanhvn.skysim.features.skill.Skill;

public class Gravel
implements ExperienceRewardStatistics,
MaterialFunction {
    @Override
    public double getRewardXP() {
        return 4.0;
    }

    @Override
    public Skill getRewardedSkill() {
        return MiningSkill.INSTANCE;
    }

    @Override
    public String getDisplayName() {
        return "Sand";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ITEM;
    }
}

