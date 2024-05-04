/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.v1_8_R3.NBTTagCompound
 */
package vn.giakhanhvn.skysim.features.item.oddities;

import net.minecraft.server.v1_8_R3.NBTTagCompound;
import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.ItemData;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.MaterialStatistics;
import vn.giakhanhvn.skysim.features.item.Rarity;

public class Bouncer
implements MaterialStatistics,
MaterialFunction,
ItemData {
    @Override
    public String getDisplayName() {
        return "Bouncer";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EXCLUSIVE;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.BLOCK;
    }

    @Override
    public NBTTagCompound getData() {
        NBTTagCompound compound = new NBTTagCompound();
        compound.setFloat("bounce", 1.0f);
        compound.setLong("delay", 20L);
        compound.setFloat("velX", 1.0f);
        compound.setFloat("velY", 1.0f);
        compound.setFloat("velZ", 1.0f);
        return compound;
    }
}

