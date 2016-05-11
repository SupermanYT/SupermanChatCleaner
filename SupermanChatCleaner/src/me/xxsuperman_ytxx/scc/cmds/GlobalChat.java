package me.xxsuperman_ytxx.scc.cmds;

import me.xxsuperman_ytxx.scc.Core;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.confuser.barapi.*;

public class GlobalChat implements CommandExecutor {
		@SuppressWarnings("deprecation")
	 	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
	 		if ((sender instanceof Player)) {
	 			Player p = (Player) sender;
	 			if (p.hasPermission("cchat.global")) {
	 				if (command.getName().equalsIgnoreCase("cgchat")) {
	 					for (int i = 0; i < 100; i++) {
	 						Bukkit.broadcastMessage("");
	 					}
	 					for (String gchat : Core.getCore().getConfig().getStringList("GlobalChatClearMsg")) {
	 						Bukkit.broadcastMessage(
	 								ChatColor.translateAlternateColorCodes('&', gchat.replaceAll("%player%", p.getName())));
	 						BarAPI.setMessage("§2§lChatul a fost Sters de " + ChatColor.BOLD + p.getDisplayName() + "§2§l!",
	 								10);
	 
	 					}
	 				} else {
	 					p.sendMessage(ChatColor.translateAlternateColorCodes('&',
	 							Core.getCore().getConfig().getString("NoPermission")));
	 
	 				}
	 			}
	 		}
	 		return false;
	 	}
	  }