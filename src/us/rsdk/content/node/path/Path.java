package us.rsdk.content.node.path;

/**
 * A builded set of steps.
 * @author Thomas Nappo
 */
public class Path {
	
	/**
	 * Data array of steps.
	 */
	private final Tile[] steps;
	
	/**
	 * Gets the path's steps.
	 * @return The path's {@link #steps}
	 */
	public Tile[] getSteps() {
		return steps;
	}
	
	/**
	 * The current build index.
	 */
	private int caret = 0;
	
	/**
	 * Gets the path's caret.
	 * @return The path's {@link #caret}
	 */
	public int getCaret() {
		return caret;
	}
	
	/**
	 * Constructs a new path.
	 * @param steps The amount of steps the path can hold.
	 */
	public Path(int steps) {
		this.steps = new Tile[steps];
	}
	
	/**
	 * Constructs a new path.
	 * @param start
	 * @param end
	 */
	public Path(Tile start, Tile end) {
		this();
		steps[0] = start;
		steps[steps.length - 1] = end;
	}
	
	/**
	 * Should we not have a specific amount
	 * of steps, the path is given 50 steps
	 * to fill. More steps than 50 is considered
	 * odd.
	 */
	public Path() {
		this(50);
	}
	
	/**
	 * Adds a step to the path.
	 * @param step The step {@link Tile} to add.
	 */
	public void add(Tile step) {
		steps[caret++] = step;
	}
	
	/**
	 * Removes the first step found searching
	 * from index 0 up.
	 * 
	 * <p><b>This does not perform any other
	 * actions than removing the step found.</b></p>
	 */
	public void removeFirst() {
		for (int i = 0; i < steps.length - 1; i++) {
			if (steps[i] == null) continue;
			remove(i);
			break;
		}
	}
	
	/**
	 * Removes the first step found searching
	 * from the last index slot down.
	 * 
	 * <p><b>This does not perform any other
	 * actions than removing the step found.</b></p>
	 */
	public void removeLast() {
		for (int i = steps.length - 1; i >= 0; i++) {
			if (steps[i] == null) continue;
			remove(i);
			break;
		}
	}
	
	/**
	 * Removes a step at a certain index.
	 * @param i The index slot which contains the step.
	 */
	public void remove(int i) {
		steps[i] = null;
	}

}