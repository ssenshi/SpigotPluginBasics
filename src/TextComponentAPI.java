package dev.stan.mc;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import org.bukkit.entity.Player;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;

public class test implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		Player player = (Player) sender;

		if (cmd.getName().equals("quiz")) {

			TextComponent clickTrue = new TextComponent("[YES]");
			TextComponent clickFalse = new TextComponent("[NO]");
			
			
			clickTrue.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/say clickTrue"));
			clickFalse.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/say clickTrue"));
			
			player.spigot().sendMessage(clickTrue, clickFalse);

		}

		return false;
	}
}
