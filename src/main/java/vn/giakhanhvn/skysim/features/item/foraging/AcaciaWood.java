/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.foraging;

import vn.giakhanhvn.skysim.features.item.ExperienceRewardStatistics;
import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.Rarity;
import vn.giakhanhvn.skysim.features.skill.ForagingSkill;
import vn.giakhanhvn.skysim.features.skill.Skill;

public class AcaciaWood
implements ExperienceRewardStatistics,
MaterialFunction {
    @Override
    public double getRewardXP() {
        return 6.0;
    }

    @Override
    public Skill getRewardedSkill() {
        return ForagingSkill.INSTANCE;
    }

    @Override
    public String getDisplayName() {
        return "Acacia Wood";
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

