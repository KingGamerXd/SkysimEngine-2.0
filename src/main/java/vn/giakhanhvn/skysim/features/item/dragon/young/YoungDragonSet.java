/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package vn.giakhanhvn.skysim.features.item.dragon.young;

import org.bukkit.entity.Player;
import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialStatistics;
import vn.giakhanhvn.skysim.features.item.PlayerBoostStatistics;
import vn.giakhanhvn.skysim.features.item.Rarity;
import vn.giakhanhvn.skysim.features.item.armor.ArmorSet;
import vn.giakhanhvn.skysim.features.item.dragon.young.YoungDragonBoots;
import vn.giakhanhvn.skysim.features.item.dragon.young.YoungDragonChestplate;
import vn.giakhanhvn.skysim.features.item.dragon.young.YoungDragonHelmet;
import vn.giakhanhvn.skysim.features.item.dragon.young.YoungDragonLeggings;

public class YoungDragonSet
implements ArmorSet {
    @Override
    public String getName() {
        return "Young Blood";
    }

    @Override
    public String getDescription() {
        return "Gain +70 Speed when you are above 50% Health.";
    }

    @Override
    public Class<? extends MaterialStatistics> getHelmet() {
        return YoungDragonHelmet.class;
    }

    @Override
    public Class<? extends MaterialStatistics> getChestplate() {
        return YoungDragonChestplate.class;
    }

    @Override
    public Class<? extends MaterialStatistics> getLeggings() {
        return YoungDragonLeggings.class;
    }

    @Override
    public Class<? extends MaterialStatistics> getBoots() {
        return YoungDragonBoots.class;
    }

    @Override
    public PlayerBoostStatistics whileHasFullSet(final Player player) {
        return new PlayerBoostStatistics(){

            @Override
            public double getBaseSpeed() {
                if (player.getHealth() > player.getMaxHealth() / 2.0) {
                    return 0.7;
                }
                return 0.0;
            }

            @Override
            public String getDisplayName() {
                return null;
            }

            @Override
            public Rarity getRarity() {
                return null;
            }

            @Override
            public String getLore() {
                return null;
            }

            @Override
            public GenericItemType getType() {
                return null;
            }
        };
    }
}

