package com.sk89q.worldguard.neoforge;

import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.internal.platform.WorldGuardPlatform;
import net.neoforged.fml.common.Mod;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(WorldGuardNeoForge.MOD_ID)
@EventBusSubscriber(modid = WorldGuardNeoForge.MOD_ID, bus = EventBusSubscriber.Bus.FORGE, value = Dist.DEDICATED_SERVER)
public class WorldGuardNeoForge {
    public static final String MOD_ID = "worldguard";

    public WorldGuardNeoForge(IEventBus modEventBus) {
        WorldGuard worldGuard = WorldGuard.getInstance();
        worldGuard.setPlatform(new NeoForgePlatform());
        worldGuard.setup();
    }

    @SubscribeEvent
    public static void onServerStarting(ServerStartingEvent event) {
        // Placeholder hook
    }
}
