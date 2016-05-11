package me.xxsuperman_ytxx.scc.cmds;

import me.xxsuperman_ytxx.scc.Core;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Info implements CommandExecutor {
	 	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
	 		if ((sender instanceof Player)) {
	 			Player p = (Player) sender;
	 			if (p.hasPermission("cchat.info")) {
	 				if (command.getName().equalsIgnoreCase("ccinfo")) {
	 					p.sendMessage(
	 							"Â§7Â§m----------Â§8=Â§eâœªÂ§aSupermanChatCleaner Â§eâœªÂ§8=Â§7Â§m----------");
	 					p.sendMessage("Â§eâž£  Â§8Plugin Creat de Â§2xXsuperman_YTXxÂ§8!");
	                    p.sendMessage("Â§eâž£  Â§8Multumiri Speciale Â§2OfficialAName  ");
	 					p.sendMessage("Â§eâž£  Â§cFunctioneaza cu Minecraft Â§21.7.x Â§c- Â§21.10.xÂ§8!");
	 					p.sendMessage("Â§eâž£  Â§cLink SpigotMC:Â§2 http://bit.ly/supermancc Â§8!");
	 					p.sendMessage("Â§eâž£  Â§cLink GitHub:Â§2 http://bit.ly/sccgit Â§8!");
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
	      
{
    }
    
    
  {   
    

  }
}
