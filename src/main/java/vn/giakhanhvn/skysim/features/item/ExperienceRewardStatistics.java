/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item;

import vn.giakhanhvn.skysim.features.skill.Skill;

public interface ExperienceRewardStatistics
extends MaterialStatistics {
    public double getRewardXP();

    public Skill getRewardedSkill();
}

