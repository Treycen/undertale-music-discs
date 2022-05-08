package net.treycen.undertalemusicdiscs;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.treycen.undertalemusicdiscs.registries.Items;
import net.treycen.undertalemusicdiscs.registries.Sounds;

public class UndertaleMusicDiscs implements ModInitializer {
    public static final String MOD_ID = "umd";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize(ModContainer mod) {
        Items.init();
        Sounds.init();
        LOGGER.info("Undertale Music Discs has sucessfully loaded! Enjoy your special tunes. :)");
    }
}