package me.hiaiden2;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import me.hiaiden2.AutoVanish.Listeners.PlayerListener;

public class Main extends JavaPlugin {
	
	@Override
    public void onEnable() {
	   
       new PlayerListener(this);
       
    }
   
    @Override
    public void onDisable() {
       
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    	
        if (command.getName().equalsIgnoreCase("autovanish") && sender instanceof Player) {
        	Player player = (Player) sender;
        	if (player.getName().equals("DoniBobes")) {
            player.sendMessage("Auto Vanish is a plugin that makes Doni auto vanish!");
        	} else { player.sendMessage("Unknown Command. Type \"/Help\" for help."); }
            return true;
        }
        
        return false;
        
    }
}
