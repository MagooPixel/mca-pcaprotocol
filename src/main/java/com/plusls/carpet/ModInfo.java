package com.plusls.carpet;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class ModInfo {
    public static String MOD_ID = "pca";  // still use pca here so protocol works
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    public static String MOD_VERSION;

    static {
        Optional<ModContainer> modContainerOptional = FabricLoader.getInstance().getModContainer(MOD_ID);
        modContainerOptional.ifPresent(modContainer -> MOD_VERSION = modContainer.getMetadata().getVersion().getFriendlyString());
    }

    @Contract("_ -> new")
    public static @NotNull Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}
