import org.bukkit.plugin.java.JavaPlugin; 
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.event.Listener;

public class ChatFilter extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable() {
		System.out.println("Plugin has been enabled");
		getServer().getPluginManager().registerEvents(this, this); 
	}
  
 	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent event) {
		
		Player player = event.getPlayer();	
		player.getWorld().playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_BELL, 3.0F, 0.5F);
    
	}
}
