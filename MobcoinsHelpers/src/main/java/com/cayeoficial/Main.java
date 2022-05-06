package com.cayeoficial;

import com.cayeoficial.listeners.MobDeath;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("[MobcoinsAddons] El plugin se está iniciando.");
        registerEvents();
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("[MobcoinsAddons] El plugin se está desactivando.");
    }

    private void registerEvents() {
        this.getServer().getPluginManager().registerEvents(new MobDeath(this), this);
    }
}
