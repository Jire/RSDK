package us.rsdk.content.model;

import us.rsdk.content.node.region.Location;

/**
 * A model which can move.
 * @author Thomas Nappo
 */
public abstract class Entity {
	
	/**
	 * The entity's tile location on the map grid.
	 */
	protected Location location = Location.create(3222, 3222);
	
	/**
	 * Gets the entity's tile location on the map grid.
	 * @return The entity's {@link #location}
	 */
	public Location getLocation() {
		return location;
	}

}