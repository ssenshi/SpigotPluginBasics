import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;
import net.md_5.bungee.api.ChatColor;


public class FlyOnGMS extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable() {
		
		getServer().getPluginManager().registerEvents(this, this);
		System.out.println("FlySpec plugin enabled [+]");
	}
	
	@EventHandler
	public void OnSurvivalMode(PlayerGameModeChangeEvent event) {
		
		System.out.println("Event is working correctly");
		
		Player player = event.getPlayer();
		if (player.getGameMode() == GameMode.SPECTATOR) {
			
			Bukkit.getScheduler().runTaskLater(this, () -> player.setAllowFlight(true), 1L);
			player.sendMessage(ChatColor.GRAY + "Your gamemode has succesfully changed to" + ChatColor.LIGHT_PURPLE + " spectator");
		}
	}
}
