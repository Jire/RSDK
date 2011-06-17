package us.rsdk.network.tunnel.components.registry;

/**
 * An entry in a {@link Registry}.
 * @author Thomas Nappo
 */
public class RegistryEntry {
	
	private Object raw;
	
	public Object getData() {
		return raw;
	}
	
	/**
	 * Constructs a new registry entry.
	 * @param raw The raw object data.
	 */
	public RegistryEntry(Object raw) {
		this.raw = raw;
	}

}