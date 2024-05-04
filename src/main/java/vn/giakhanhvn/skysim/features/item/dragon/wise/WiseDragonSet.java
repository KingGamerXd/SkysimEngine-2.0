/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.dragon.wise;

import vn.giakhanhvn.skysim.features.item.MaterialStatistics;
import vn.giakhanhvn.skysim.features.item.armor.ArmorSet;
import vn.giakhanhvn.skysim.features.item.dragon.wise.WiseDragonBoots;
import vn.giakhanhvn.skysim.features.item.dragon.wise.WiseDragonChestplate;
import vn.giakhanhvn.skysim.features.item.dragon.wise.WiseDragonHelmet;
import vn.giakhanhvn.skysim.features.item.dragon.wise.WiseDragonLeggings;

public class WiseDragonSet
implements ArmorSet {
    @Override
    public String getName() {
        return "Wise Blood";
    }

    @Override
    public String getDescription() {
        return "All abilities cost 1/3 less Mana.";
    }

    @Override
    public Class<? extends MaterialStatistics> getHelmet() {
        return WiseDragonHelmet.class;
    }

    @Override
    public Class<? extends MaterialStatistics> getChestplate() {
        return WiseDragonChestplate.class;
    }

    @Override
    public Class<? extends MaterialStatistics> getLeggings() {
        return WiseDragonLeggings.class;
    }

    @Override
    public Class<? extends MaterialStatistics> getBoots() {
        return WiseDragonBoots.class;
    }
}

