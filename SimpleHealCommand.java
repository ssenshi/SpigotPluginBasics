package dev.stan.mc;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Main extends JavaPlugin {
	

	@Override
	public void onEnable() {
		System.out.println("[blankPlugin] Enabled");
	}
	
	@Override
	public void onDisable() {
		System.out.println("[blankPlugin] Disabled");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equals("heal")) {
			
			if (sender instanceof Player) {
				Player player = (Player) sender;
				
				player.sendMessage(ChatColor.GREEN + player.getName() + ChatColor.GRAY + " your health has been" + ChatColor.GREEN + "restored");
				player.setHealth(20.0);
			} else {
				System.out.println("You cannot use this command through console!");
			}
			
		}
		
		
		return false;
	}
	
	
}
© 2021 GitHub, Inc.
