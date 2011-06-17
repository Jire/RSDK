package us.rsdk.network.tunnel.components.registry;

import java.util.HashMap;
import java.util.Map;

/**
 * Keeps track of settings for all tunnels.
 * @author Thomas Nappo
 */
public class Registry {
	
	// maps the identifying key to it's registry entry value.
	private final Map<String, RegistryCell> data = new HashMap<String, RegistryCell>();
	
	/**
	 * Gets a cell for it's identifying name key.
	 * @param key The cell's identifier.
	 * @return The {@link RegistryCell} which mathces the
	 * identifying key, or <code>null</code> if the key could
	 * not be matched.
	 */
	public RegistryCell getCell(String key) {
		return data.get(key);
	}
	
	/**
	 * Creates a new registry cell.
	 * @param name The identifying key name of the registry key.
	 */
	public void createCell(String name) {
		data.put(name, new RegistryCell());
	}

}