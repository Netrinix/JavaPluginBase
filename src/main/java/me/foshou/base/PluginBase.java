package me.foshou.base;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginBase extends JavaPlugin {
    @Getter
    public static PluginBase INSTANCE;

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[&ePluginName&f] Plugin Loaded! Version: 0.0.1");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
