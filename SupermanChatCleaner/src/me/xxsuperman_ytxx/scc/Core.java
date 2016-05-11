package me.xxsuperman_ytxx.scc;

import org.bukkit.configuration.file.FileConfiguration;
import me.xxsuperman_ytxx.scc.Updater;
import org.bukkit.plugin.java.JavaPlugin;

import me.xxsuperman_ytxx.scc.cmds.GlobalChat;
import me.xxsuperman_ytxx.scc.cmds.Help;
import me.xxsuperman_ytxx.scc.cmds.Info;
import me.xxsuperman_ytxx.scc.cmds.PersonalChat;

public class Core extends JavaPlugin {
	public static Core core;

	private static String version;
	FileConfiguration config = getConfig();
	private static boolean updateAvailable;

	public Core() {
		core = this;
	}

	public static Core getCore() {
		return core;
	}

	public void onEnable() {
		getLogger().info("#---------------------------------------------#");
		getLogger().info("SupermanChatCleaner a Pornit! Versiunea: 1.2.8!");
		getLogger().info("Plugin creat de xXsuperman_YTXx");
		getLogger().info("#---------------------------------------------#");
		getCommand("cpchat").setExecutor(new PersonalChat());
		getCommand("cgchat").setExecutor(new GlobalChat());
		getCommand("cchat").setExecutor(new Help());
		getCommand("ccinfo").setExecutor(new Info());
		saveDefaultConfig();
		getServer().getScheduler().runTaskLaterAsynchronously(this, new Runnable() {
	        public void run() {
	            checkUpdate();
	        }
	    }, 20L);
	}

private void checkUpdate() {
	  this.getLogger().info("Verific daca exista update-uri disponibile...");
    final Updater updater = new Updater(this, 17063, false);
    final Updater.UpdateResult result = updater.getResult();
    switch (result) {
        case FAIL_SPIGOT: {
            this.getLogger().info("AutoUpdate nu a putut sa faca conectiunea.");
            break;
        }
        case DISABLED: {
            this.getLogger().info("AutoUpdate este Dezactivat!");
            break;
        }
        case NO_UPDATE: {
            this.getLogger().info("Pluginul este la ultima Versiune!");
            break;
        }
        case UPDATE_AVAILABLE: {
      	  Core.version = updater.getVersion();
            this.getLogger().warning("============================================");
            this.getLogger().warning("Este un Update Disponibil!:");
            this.getLogger().warning("Versiunea " + version);
            this.getLogger().warning("============================================");
            Core.setUpdateAvailable(true);
            break;
            
        }
        default: {
      	  getLogger().fine(result.toString());
            break;
        }
    }
}

 
public static boolean isUpdateAvailable() {
	return updateAvailable;
}

public static void setUpdateAvailable(boolean updateAvailable) {
	Core.updateAvailable = updateAvailable;
}


{
	  
}

	   

}
