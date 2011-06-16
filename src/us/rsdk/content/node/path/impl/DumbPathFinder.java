package us.rsdk.content.node.path.impl;

import us.rsdk.content.model.Entity;
import us.rsdk.content.node.path.Path;
import us.rsdk.content.node.path.PathFinder;
import us.rsdk.content.node.path.Tile;

/**
 * A {@link PathFinder} which generates paths in a dumb condition which
 * does not build "around" block points.
 * @author Thomas Nappo
 */
public class DumbPathFinder implements PathFinder {
	
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