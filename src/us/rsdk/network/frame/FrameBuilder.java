package us.rsdk.network.frame;

import org.jboss.netty.buffer.ChannelBuffer;

public class FrameBuilder extends Frame {

	public FrameBuilder(Type type, int opCode, ChannelBuffer buffer) {
		super(type, opCode, buffer);
	}

}