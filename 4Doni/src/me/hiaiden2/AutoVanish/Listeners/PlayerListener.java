package me.hiaiden2.AutoVanish.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.myzelyam.api.vanish.VanishAPI;
import me.hiaiden2.Main;

public class PlayerListener implements Listener {

	public PlayerListener(Main plugin) {
		
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
		
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player player = (Player) e.getPlayer();
		
		if (player.getName().equals("DoniBobes")) {
			e.setJoinMessage("");
			if (Bukkit.getPluginManager().isPluginEnabled("SuperVanish")) {
				VanishAPI.hidePlayer(player);
			}
		}
	}

}
