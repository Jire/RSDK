package us.rsdk.content.node.path;

/**
 * A grid on the map.
 * @author Thomas Nappo
 */
public class TileGrid {
	
	private final Tile[][] tiles;
	
	public final Tile[][] getTiles() {
		return tiles;
	}
	
	/**
	 * Retrieves the height of a tile.
	 * @param tile The tile to check height for.
	 * @return The height level of the tile.
	 */
	public int getHeight(Tile tile) {
		for (int i = 0; i < tiles.length - 1; i++) {
			for (int i2 = 0; i2 < tiles[i].length; i2++) {
				if (tiles[i][i2] == tile) return i2;
			}
		}
		return 0;
	}
	
	public TileGrid(Tile[][] tiles) {
		this.tiles = tiles;
	}

}