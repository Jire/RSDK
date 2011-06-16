package us.rsdk.content.node.path.impl;

import us.rsdk.content.model.Entity;
import us.rsdk.content.node.path.*;

/**
 * A {@link PathFinder} which generates paths in a smart condition which
 * derives from start to end locations (if possible).
 * @author Thomas Nappo
 */
public class SmartPathFinder implements PathFinder {

	@Override
	public Path find(Tile start, Tile end) {
		final Path build = new Path(start, end);
		return build;
	}
	
	/**
	 * Finds a path between one entity and another.
	 * @param entity The entity to start from.
	 * @param to The entity to finish at.
	 * @return The generated {@link Path} or <tt>null</tt> if it failed.
	 */
	public Path find(Entity entity, Entity to) {
		return find(entity.getLocation(), to.getLocation());
	}

}