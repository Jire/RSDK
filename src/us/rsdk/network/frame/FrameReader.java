package us.rsdk.network.frame;

import org.jboss.netty.buffer.ChannelBuffer;

public class FrameReader extends Frame {

	public FrameReader(Type type, int opCode, ChannelBuffer buffer) {
		super(type, opCode, buffer);
	}

}