package se.hedonix.villagerswithguns.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerGreeting implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.LIGHT_PURPLE + "[VWG]: You will die in 10 seconds (:");
        try {
            Thread.sleep(10 * 1000);
        } catch (Exception e) {
            player.sendMessage(ChatColor.RED + "[VWG]: Sleep failed");
        }
        player.damage(100);
    }
}
