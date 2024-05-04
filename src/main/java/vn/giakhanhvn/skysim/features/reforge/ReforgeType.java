/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.reforge;

import vn.giakhanhvn.skysim.features.reforge.Ancient;
import vn.giakhanhvn.skysim.features.reforge.EpicReforge;
import vn.giakhanhvn.skysim.features.reforge.Fabled;
import vn.giakhanhvn.skysim.features.reforge.FastReforge;
import vn.giakhanhvn.skysim.features.reforge.FierceReforge;
import vn.giakhanhvn.skysim.features.reforge.GeniusReforge;
import vn.giakhanhvn.skysim.features.reforge.Hasty;
import vn.giakhanhvn.skysim.features.reforge.HeroicReforge;
import vn.giakhanhvn.skysim.features.reforge.LegendaryReforge;
import vn.giakhanhvn.skysim.features.reforge.Necrotic;
import vn.giakhanhvn.skysim.features.reforge.OddReforge;
import vn.giakhanhvn.skysim.features.reforge.OverpoweredReforge;
import vn.giakhanhvn.skysim.features.reforge.RapidReforge;
import vn.giakhanhvn.skysim.features.reforge.Reforge;
import vn.giakhanhvn.skysim.features.reforge.Renowned;
import vn.giakhanhvn.skysim.features.reforge.SharpReforge;
import vn.giakhanhvn.skysim.features.reforge.SpicyReforge;
import vn.giakhanhvn.skysim.features.reforge.Spiritual;
import vn.giakhanhvn.skysim.features.reforge.StronkReforge;
import vn.giakhanhvn.skysim.features.reforge.SupergeniusReforge;
import vn.giakhanhvn.skysim.features.reforge.Unreal;
import vn.giakhanhvn.skysim.features.reforge.Wise;
import vn.giakhanhvn.skysim.features.reforge.WitheredReforge;

public enum ReforgeType {
    OVERPOWERED(OverpoweredReforge.class, false),
    GENIUS(GeniusReforge.class),
    STRONK(StronkReforge.class),
    SUPERGENIUS(SupergeniusReforge.class, false),
    HASTY(Hasty.class),
    FAST(FastReforge.class),
    SPICY(SpicyReforge.class),
    FIERCE(FierceReforge.class),
    HEROIC(HeroicReforge.class),
    ODD(OddReforge.class),
    RAPID(RapidReforge.class),
    ANCIENT(Ancient.class),
    WITHERED(WitheredReforge.class),
    LEGENDARY(LegendaryReforge.class),
    SHARP(SharpReforge.class),
    EPIC(EpicReforge.class),
    FABLED(Fabled.class),
    RENOWNED(Renowned.class),
    SPIRITUAL(Spiritual.class),
    UNREAL(Unreal.class),
    WISE(Wise.class),
    NECROTIC(Necrotic.class);

    private final Class<? extends Reforge> clazz;
    private final boolean accessible;

    private ReforgeType(Class<? extends Reforge> clazz, boolean accessible) {
        this.clazz = clazz;
        this.accessible = accessible;
    }

    private ReforgeType(Class<? extends Reforge> clazz) {
        this(clazz, true);
    }

    public Reforge getReforge() {
        try {
            return this.clazz.newInstance();
        }
        catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ReforgeType getReforgeType(String name) {
        return ReforgeType.valueOf(name.toUpperCase());
    }

    public static ReforgeType getByClass(Class<? extends Reforge> clazz) {
        for (ReforgeType type : ReforgeType.values()) {
            if (type.clazz != clazz) continue;
            return type;
        }
        return null;
    }

    public boolean isAccessible() {
        return this.accessible;
    }
}

