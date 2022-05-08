package net.treycen.undertalemusicdiscs.registries;

import net.treycen.undertalemusicdiscs.UndertaleMusicDiscs;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Sounds {
    public static final SoundEvent SOUND_ALPHYS = register("music_disc.alphys");
    public static final SoundEvent SOUND_ASGORE = register("music_disc.asgore");
    public static final SoundEvent SOUND_BONETROUSLE = register("music_disc.bonetrousle");
    public static final SoundEvent SOUND_CORE = register("music_disc.core");
    public static final SoundEvent SOUND_DEATHBYGLAMOUR = register("music_disc.deathbyglamour");
    public static final SoundEvent SOUND_DOGSONG = register("music_disc.dogsong");
    public static final SoundEvent SOUND_DUMMY = register("music_disc.dummy");
    public static final SoundEvent SOUND_FALLENDOWN = register("music_disc.fallendown");
    public static final SoundEvent SOUND_GHOSTFIGHT = register("music_disc.ghostfight");
    public static final SoundEvent SOUND_HEARTACHE = register("music_disc.heartache");
    public static final SoundEvent SOUND_HOTEL = register("music_disc.hotel");
    public static final SoundEvent SOUND_MEGALOVANIA = register("music_disc.megalovania");
    public static final SoundEvent SOUND_OHONETRUELOVE = register("music_disc.ohonetruelove");
    public static final SoundEvent SOUND_SANS = register("music_disc.sans");
    public static final SoundEvent SOUND_SHOP = register("music_disc.shop");
    public static final SoundEvent SOUND_SPEAROFJUSTICE = register("music_disc.spearofjustice");
    public static final SoundEvent SOUND_SPIDERDANCE = register("music_disc.spiderdance");
    public static final SoundEvent SOUND_UNDYNE = register("music_disc.undyne");
    public static final SoundEvent SOUND_WATERFALL = register("music_disc.waterfall");

    public static SoundEvent register(String name) {
        Identifier id = new Identifier(UndertaleMusicDiscs.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void init() { }

}
