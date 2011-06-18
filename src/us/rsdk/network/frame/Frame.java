package us.rsdk.network.frame;

import org.jboss.netty.buffer.ChannelBuffer;

/**
 * A data frame.
 * @author Thomas Nappo
 */
public abstract class Frame {
	
	/**
	 * The type of frame.
	 * @author Thomas Nappo
	 */
	public static enum Type {
		
		/**
		 * The frame is writing raw data.
		 */
		RAW,
		
		/**
		 * The frame is writing unraw fixed data.
		 */
		FIXED,
		
		/**
		 * The frame is writing a byte more data.
		 */
		BYTE,
		
		/**
		 * The frame is writing a short more data.
		 */
		SHORT;
		
	}
	
	/**
	 * The {@link Type} of frame.
	 */
	private final Type type;
	
	/**
	 * @return The frame's {@link #type}.
	 */
	public Type getType() {
		return type;
	}
	
	/**
	 * The identifying operation code of the frame.
	 */
	private final int opCode;
	
	/**
	 * @return The {@link #opCode} of the frame.
	 */
	public int getOpCode() {
		return opCode;
	}
	
	/**
	 * The {@link ChannelBuffer} which provides functionality for
	 * reading/writing to an output stream.
	 */
	protected final ChannelBuffer buffer;
	
	/**
	 * @return The {@link #buffer} of the frame.
	 */
	public ChannelBuffer getBuffer() {
		return buffer;
	}
	
	/**
	 * Constructs a new frame.
	 * @param type The type of frame.
	 * @param opCode The operation code of the frame.
	 * @param buffer The {@link ChannelBuffer} which provides functionality for
	 * reading/writing to an output stream.
	 */
	public Frame(Type type, int opCode, ChannelBuffer buffer) {
		this.type = type;
		this.opCode = opCode;
		this.buffer = buffer;
	}

}