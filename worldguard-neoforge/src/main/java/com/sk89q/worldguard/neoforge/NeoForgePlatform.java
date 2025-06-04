package com.sk89q.worldguard.neoforge;

import com.sk89q.worldedit.util.formatting.text.TextComponent;
import com.sk89q.worldedit.world.World;
import com.sk89q.worldedit.world.gamemode.GameMode;
import com.sk89q.worldguard.LocalPlayer;
import com.sk89q.worldguard.config.ConfigurationManager;
import com.sk89q.worldguard.internal.platform.DebugHandler;
import com.sk89q.worldguard.internal.platform.StringMatcher;
import com.sk89q.worldguard.internal.platform.WorldGuardPlatform;
import com.sk89q.worldguard.protection.flags.FlagContext;
import com.sk89q.worldguard.protection.regions.RegionContainer;
import com.sk89q.worldguard.session.SessionManager;
import com.sk89q.worldguard.util.profile.cache.ProfileCache;
import com.sk89q.worldguard.util.profile.resolver.ProfileService;
import com.sk89q.worldguard.protection.flags.registry.SimpleFlagRegistry;
import com.sk89q.worldguard.protection.flags.registry.FlagRegistry;
import com.sk89q.worldguard.WorldGuard;

import javax.annotation.Nullable;
import java.nio.file.Path;

public class NeoForgePlatform implements WorldGuardPlatform {
    private final FlagRegistry flagRegistry = new SimpleFlagRegistry();

    @Override
    public String getPlatformName() {
        return "NeoForge";
    }

    @Override
    public String getPlatformVersion() {
        return WorldGuard.getVersion();
    }

    @Override
    public void notifyFlagContextCreate(FlagContext.FlagContextBuilder flagContextBuilder) {
        // no platform events
    }

    @Override
    public ConfigurationManager getGlobalStateManager() {
        return null; // not implemented
    }

    @Override
    public StringMatcher getMatcher() {
        return null;
    }

    @Override
    public SessionManager getSessionManager() {
        return null;
    }

    @Override
    public void broadcastNotification(String message) {
        // TODO: send to ops
    }

    @Override
    public void broadcastNotification(TextComponent component) {
        // TODO
    }

    @Override
    public void load() {
        // TODO initialize configuration
    }

    @Override
    public void unload() {
    }

    @Override
    public RegionContainer getRegionContainer() {
        return null;
    }

    @Override
    public DebugHandler getDebugHandler() {
        return null;
    }

    @Override
    public GameMode getDefaultGameMode() {
        return null;
    }

    @Override
    public Path getConfigDir() {
        return Path.of("config/worldguard");
    }

    @Deprecated(forRemoval = true)
    @Override
    public void stackPlayerInventory(LocalPlayer localPlayer) {
        // no-op
    }

    @Override
    public void addPlatformReports(com.sk89q.worldedit.util.report.ReportList report) {
    }

    @Override
    public ProfileService createProfileService(ProfileCache profileCache) {
        return null;
    }

    @Nullable
    @Override
    public com.sk89q.worldguard.protection.regions.ProtectedRegion getSpawnProtection(World world) {
        return null;
    }

    @Override
    public FlagRegistry getFlagRegistry() {
        return flagRegistry;
    }
}
