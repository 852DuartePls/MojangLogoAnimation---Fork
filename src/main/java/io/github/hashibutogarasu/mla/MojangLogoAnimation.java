package io.github.hashibutogarasu.mla;

import io.github.hashibutogarasu.mla.sounds.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MojangLogoAnimation implements ModInitializer {
	public static String MOD_ID = "mla";
	public static final Logger LOGGER = LoggerFactory.getLogger("mla");

	@Override
	public void onInitialize() {
		Registry.register(Registries.SOUND_EVENT, ModSounds.MOJANG_SOUND, ModSounds.MOJANG_SOUND_EVENT);
	}
}