package net.treycen.undertalemusicdiscs.registries;

import net.treycen.undertalemusicdiscs.UndertaleMusicDiscs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.treycen.undertalemusicdiscs.items.AbstractDiscItem;

public class Items {
    public static final Item DISC_ALPHYS = register("music_disc_alphys", Sounds.SOUND_ALPHYS);
    public static final Item DISC_ASGORE = register("music_disc_asgore", Sounds.SOUND_ASGORE);
    public static final Item DISC_BONETROUSLE = register("music_disc_bonetrousle", Sounds.SOUND_BONETROUSLE);
    public static final Item DISC_CORE = register("music_disc_core", Sounds.SOUND_CORE);
    public static final Item DISC_DEATHBYGLAMOUR = register("music_disc_deathbyglamour", Sounds.SOUND_DEATHBYGLAMOUR);
    public static final Item DISC_DOGSONG = register("music_disc_dogsong", Sounds.SOUND_DOGSONG);
    public static final Item DISC_DUMMY = register("music_disc_dummy", Sounds.SOUND_DUMMY);
    public static final Item DISC_FALLENDOWN = register("music_disc_fallendown", Sounds.SOUND_FALLENDOWN);
    public static final Item DISC_GHOSTFIGHT = register("music_disc_ghostfight", Sounds.SOUND_GHOSTFIGHT);
    public static final Item DISC_HEARTACHE = register("music_disc_heartache", Sounds.SOUND_HEARTACHE);
    public static final Item DISC_HOTEL = register("music_disc_hotel", Sounds.SOUND_HOTEL);
    public static final Item DISC_MEGALOVANIA = register("music_disc_megalovania", Sounds.SOUND_MEGALOVANIA);
    public static final Item DISC_OHONETRUELOVE = register("music_disc_ohonetruelove", Sounds.SOUND_OHONETRUELOVE);
    public static final Item DISC_SANS = register("music_disc_sans", Sounds.SOUND_SANS);
    public static final Item DISC_SHOP = register("music_disc_shop", Sounds.SOUND_SHOP);
    public static final Item DISC_SPEAROFJUSTICE = register("music_disc_spearofjustice", Sounds.SOUND_SPEAROFJUSTICE);
    public static final Item DISC_SPIDERDANCE = register("music_disc_spiderdance", Sounds.SOUND_SPIDERDANCE);
    public static final Item DISC_UNDYNE = register("music_disc_undyne", Sounds.SOUND_UNDYNE);
    public static final Item DISC_WATERFALL = register("music_disc_waterfall", Sounds.SOUND_WATERFALL);

    public static Item register(String id, SoundEvent sound) {
        Item.Settings settings = new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(ItemGroup.MISC);
        return Registry.register(Registry.ITEM, new Identifier(UndertaleMusicDiscs.MOD_ID, id), new AbstractDiscItem(14, sound, settings));
    }
    public static void init() { }
}
