package se.hedonix.villagerswithguns;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[VWG]: Plugin enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[VWG]: Plugin disabled");
    }
}
