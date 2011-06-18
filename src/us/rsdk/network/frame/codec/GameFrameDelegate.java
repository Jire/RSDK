package us.rsdk.network.frame.codec;

import us.rsdk.network.frame.FrameReader;
import us.rsdk.network.frame.codec.handlers.*;

/**
 * Delegates in/out game frames.
 * @author Thomas Nappo
 */
public class GameFrameDelegate {
	
	// raw array which puts the frame handler in the slot of the op code it handles.
	private static final GameFrameHandler[] mesh = new GameFrameHandler[255];
	// handles unhandled frames
	private static final GameFrameHandler defaultHandler = new Default();
	
	/**
	 * Assigns a {@link GameFrameHandler} to an operation code.
	 * @param opCode The identifying operation code which is associated with the handler.
	 * @param handler The actual handler implementation.
	 */
	public static void assign(int opCode, GameFrameHandler handler) {
		mesh[opCode] = handler;
	}
	
	/**
	 * Handles an incoming frame.
	 * @param in The {@link FrameReader} to handle.
	 */
	public static void handle(FrameReader in) {
		if (mesh[in.getOpCode()] == null) {
			defaultHandler.handle(in, in.getBuffer());
			return;
		}
		mesh[in.getOpCode()].handle(in, in.getBuffer());
	}
	
}