import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandExecutor extends JavaPlugin implements Listener {

	
	@Override
	public void onEnable() {
	
		getLogger().info("Plugin enabled");
    getServer().getPluginManager().registerEvents(new {class name}, this);
    }
}
