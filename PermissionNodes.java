package dev.stan.mc;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;


public class Main extends JavaPlugin implements Listener {
	

	@Override
	public void onEnable() {
		System.out.println("[blankPlugin] Enabled");
		
		Bukkit.getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		Player player = e.getPlayer();
		if (!player.hasPermission("eclipse.allow.move") ) {
			e.setCancelled(true);
		}
	}
}
