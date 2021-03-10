package dev.stan.mc;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;



public class Main extends JavaPlugin implements Listener {
	

	@Override
	public void onEnable() {
		System.out.println("[blankPlugin] Enabled");
		
		this.getConfig().options().copyDefaults();
		saveDefaultConfig();
		
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		
		if (cmd.getName().equals("config")) {
			String word = this.getConfig().getString("Word");
			int number = this.getConfig().getInt("Number");
			
			player.sendMessage(ChatColor.GRAY + "The word is " + ChatColor.GREEN + word + ChatColor.GRAY + "and the number is " + ChatColor.GREEN + number);

		}
		
		return false;
		
		
	}
	
	
}
