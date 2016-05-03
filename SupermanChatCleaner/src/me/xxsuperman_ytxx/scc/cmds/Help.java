package me.xxsuperman_ytxx.scc.cmds;

import me.xxsuperman_ytxx.scc.Core;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Help
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    if ((sender instanceof Player))
    {
      Player p = (Player)sender;
      if (p.hasPermission("cchat.help"))
      {
        if (command.getName().equalsIgnoreCase("cchat"))
        {
          p.sendMessage("§7§m----------§8=§e✪§aSupermanChatCleaner §cv1.2.2§e✪§8=§7§m----------");
          p.sendMessage("§e➣  §7/cgchat §e- §2Pentru a sterge chatul global!");
          p.sendMessage("§e➣  §7/cpchat §e- §2Pentru a sterge chatul tau!");
          p.sendMessage("§e➣  §7/cchat §e- §2Pentru a intra in acest meniu!");
          p.sendMessage("§e➣  §7/ccinfo §e- §2Pentru a intra in Meniul de Informatii!");
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
