package us.rsdk.content.node.path;

/**
 * Generates a {@link Path}
 * @author Thomas Nappo
 */
public interface PathFinder {
	
	/**
	 * Builds a new {@link Path} from two points.
	 * @param start The start tile.
	 * @param end The end tile.
	 * @return The new builded path or <tt>null</tt> if path generation failed.
	 */
	public Path find(Tile start, Tile end);

}