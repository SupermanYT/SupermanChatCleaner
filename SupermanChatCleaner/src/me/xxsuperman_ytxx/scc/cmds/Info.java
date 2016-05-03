package me.xxsuperman_ytxx.scc.cmds;

import me.xxsuperman_ytxx.scc.Core;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Info
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    if ((sender instanceof Player))
    {
      Player p = (Player)sender;
      if (p.hasPermission("cchat.info"))
      {
        if (command.getName().equalsIgnoreCase("ccinfo"))
        {
          p.sendMessage("§7§m----------§8=§e✪§aSupermanChatCleaner §cv1.2.2§e✪§8=§7§m----------");
          p.sendMessage("§e➣  §8Plugin Creat de §2xXsuperman_YTXx§8!");
          p.sendMessage("§e➣  §cFunctioneaza cu Minecraft §21.7.x §c- §21.9.x§8!");
          p.sendMessage("§e➣  §cLink SpigotMC:§2 bit.ly/supermancc §8!");
          p.sendMessage("§7§m----------§8=§e✪§aSupermanChatCleaner §cv1.2.2§e✪§8=§7§m----------");
        }
        
      }
      else
      {
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', Core.getCore().getConfig().getString("NoPermission")));
      }
      return true;
    
    }
	return false;
    
    
  
    
    }
    
    
  {   
    

  }
}
