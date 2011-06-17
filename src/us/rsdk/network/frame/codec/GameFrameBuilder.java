package us.rsdk.network.frame.codec;

import org.jboss.netty.buffer.ChannelBuffer;

import us.rsdk.network.frame.FrameBuilder;

public class GameFrameBuilder extends FrameBuilder {

	public GameFrameBuilder(Type type, int opCode, ChannelBuffer buffer) {
		super(type, opCode, buffer);
	}

}