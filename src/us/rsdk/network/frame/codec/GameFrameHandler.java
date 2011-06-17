package us.rsdk.network.frame.codec;

import us.rsdk.network.frame.FrameReader;

/**
 * Handles an incoming data frame.
 * @author Thomas Nappo
 */
public interface GameFrameHandler {
	
	/**
	 * Executed when the game frame is handled.
	 * @param in The input {@link FrameReader} which was builded from the raw data frame.
	 */
	public void handle(final FrameReader in);

}