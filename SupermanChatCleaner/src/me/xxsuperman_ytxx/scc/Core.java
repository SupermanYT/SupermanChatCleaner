package me.xxsuperman_ytxx.scc;

import me.xxsuperman_ytxx.scc.cmds.GlobalChat;
import me.xxsuperman_ytxx.scc.cmds.Help;
import me.xxsuperman_ytxx.scc.cmds.PersonalChat;
import me.xxsuperman_ytxx.scc.cmds.Info;


import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import me.xxsuperman_ytxx.scc.Core;

public class Core extends JavaPlugin {
    


public void onDisable()	{
	getLogger().info("#---------------------------------------------#");
	getLogger().info("SupermanChatCleaner a fost dezactivat!");
	getLogger().info("#---------------------------------------------#");
	
}
  public static Core core;
  FileConfiguration config = getConfig();
  

  public Core()
  {
    core = this;
  }

  public static Core getCore()
  {
    return core;
  }
  
  
  
  public void onEnable()
  {
	getLogger().info("#---------------------------------------------#");
	getLogger().info("SupermanChatCleaner a Pornit! Versiunea: 1.2.2!");
	getLogger().info("Plugin creat de xXsuperman_YTXx");
	getLogger().info("#---------------------------------------------#");
    getCommand("cpchat").setExecutor(new PersonalChat());
    getCommand("cgchat").setExecutor(new GlobalChat());
    getCommand("cchat").setExecutor(new Help());
    getCommand("ccinfo").setExecutor(new Info());
    saveDefaultConfig();
   
    
  }	
  
   
  {
	  
  }

	   
  
}

