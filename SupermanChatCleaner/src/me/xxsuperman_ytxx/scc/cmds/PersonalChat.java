package me.xxsuperman_ytxx.scc.cmds;

import me.xxsuperman_ytxx.scc.Core;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.confuser.barapi.*;

public class PersonalChat implements CommandExecutor {
	 	@SuppressWarnings("deprecation")
	 	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
	 		if ((sender instanceof Player)) {
	 			Player p = (Player) sender;
	 			if (p.hasPermission("cchat.personal")) {
	 				if (command.getName().equalsIgnoreCase("cpchat")) {
	 					for (int i = 0; i < 100; i++) {
	 						p.sendMessage("");
	 					}
	 					for (String pchat : Core.getCore().getConfig().getStringList("PersonalChatClearMsg")) {
	 						p.sendMessage(
	 								ChatColor.translateAlternateColorCodes('&', pchat.replaceAll("%player%", p.getName())));
	 						BarAPI.setMessage("�2�lTi-ai sters Propriul Chat!", 10);
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