package me.xxsuperman_ytxx.scc.cmds;

import me.xxsuperman_ytxx.scc.Core;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Help implements CommandExecutor {
	 	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
	 		if ((sender instanceof Player)) {
	 			Player p = (Player) sender;
	 			if (p.hasPermission("cchat.help")) {
	 				if (command.getName().equalsIgnoreCase("cchat")) {
	 					p.sendMessage(
	 							"Â§7Â§m----------Â§8=Â§eâœªÂ§aSupermanChatCleaner Â§eâœªÂ§8=Â§7Â§m----------");
	 					p.sendMessage("Â§eâž£  Â§7/cgchat Â§e- Â§2Pentru a sterge chatul global!");
	 					p.sendMessage("Â§eâž£  Â§7/cpchat Â§e- Â§2Pentru a sterge chatul tau!");
	 					p.sendMessage("Â§eâž£  Â§7/cchat Â§e- Â§2Pentru a intra in acest meniu!");
	 					p.sendMessage("Â§eâž£  Â§7/ccinfo Â§e- Â§2Pentru a intra in Meniul de Informatii!");
	 					p.sendMessage(
	 							"Â§7Â§m----------Â§8=Â§eâœªÂ§aSupermanChatCleaner Â§eâœªÂ§8=Â§7Â§m----------");
	 				} else {
	 					p.sendMessage(ChatColor.translateAlternateColorCodes('&',
	 							Core.getCore().getConfig().getString("NoPermission")));
	 				}
	 			}
	 		}
	 		return false;
	 	}
	  }