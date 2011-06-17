package us.rsdk.network.tunnel.components.registry;

import java.util.HashMap;

/**
 * Groups {@link RegistryEntry} entries together.
 * @author Thomas Nappo
 */
public class RegistryCell extends HashMap<String, RegistryEntry> {

	// used if we ever wanted to serialize the cell.
	private static final long serialVersionUID = 1L;

}