/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.farming;

import vn.giakhanhvn.skysim.features.item.ExperienceRewardStatistics;
import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.Rarity;
import vn.giakhanhvn.skysim.features.skill.FarmingSkill;
import vn.giakhanhvn.skysim.features.skill.Skill;

public class WheatSeeds
implements ExperienceRewardStatistics,
MaterialFunction {
    @Override
    public double getRewardXP() {
        return 1.0;
    }

    @Override
    public Skill getRewardedSkill() {
        return FarmingSkill.INSTANCE;
    }

    @Override
    public String getDisplayName() {
        return "Wheat Seeds";
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

