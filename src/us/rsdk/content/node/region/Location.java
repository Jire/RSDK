package us.rsdk.content.node.region;

import us.rsdk.content.node.path.Tile;

/**
 * A point on the map.
 * @author Thomas Nappo
 */
public class Location extends Tile {
	
	private final int z;
	
	public int getZ() {
		return z;
	}
	
	public int getLocalX() {
		return getLocalX(this);
	}
	
	public int getLocalY() {
		return getLocalY(this);
	}
	
	public int getLocalX(Location l) {
		return x - 8 * (l.getRegionX() - 6);
	}
	
	public int getLocalY(Location l) {
		return y - 8 * (l.getRegionY() - 6);
	}
	
	public int getRegionX() {
		return x >> 3;
	}
	
	public int getRegionY() {
		return y >> 3;
	}
	
	/**
	 * Constructs a new location.
	 * @param x The X coordinate.
	 * @param y The Y coordinate.
	 * @param z The Z coordinate <tt>height</tt>.
	 * @deprecated Because of the creation of {@link #create(int, int, int)}
	 */
	@Deprecated
	public Location(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	/**
	 * Constructs a new location at default height <tt>0</tt>.
	 * @param x The X coordinate.
	 * @param y The Y coordinate.
	 * @deprecated Because of the creation of {@link #create(int, int)}
	 */
	@Deprecated
	public Location(int x, int y) {
		this(x, y, 0);
	}
	
	/**
	 * Constructs a new location.
	 * @param x The X coordinate.
	 * @param y The Y coordinate.
	 * @param z The Z coordinate <tt>height</tt>.
	 */
	public static Location create(int x, int y, int z) {
		return new Location(x, y, z);
	}
	
	/**
	 * Constructs a new location at default height <tt>0</tt>.
	 * @param x The X coordinate.
	 * @param y The Y coordinate.
	 */
	public static Location create(int x, int y) {
		return new Location(x, y);
	}
	
	@Override
	public boolean equals(Object o) {
		return super.equals(o) && ((Location) o).z == z;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + "," + z + ")";
	}

}