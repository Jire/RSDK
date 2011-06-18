package us.rsdk.network.frame.codec.handlers;

import java.util.logging.Logger;

import org.jboss.netty.buffer.ChannelBuffer;

import us.rsdk.network.frame.FrameReader;
import us.rsdk.network.frame.codec.GameFrameHandler;

/**
 * Handles unhandled game frames.
 * 
 * <h3>Current Implementation</h3>
 * The delegate submits a handle request for a frame marked by
 * the operation code <tt>12</tt>. The delegate cannot find an
 * associated {@link GameFrameHandler} for operation code <tt>12</tt>,
 * therefore the {@link FrameReader} input is sent to the default handler,
 * which is this class.<p />
 * 
 * <p>This handler then uses it's {@link #logger} to send information towards
 * the console which includes the input's operation code, saying it was unhandled as so:
 * <pre>logger.info("Unhandled frame: (" + in.getOpCode() + ")");</pre></p>
 * 
 * @author Thomas Nappo
 */
public class Default implements GameFrameHandler {
	
	private static final Logger logger = Logger.getLogger(Default.class.getName());

	@Override
	public void handle(FrameReader in, ChannelBuffer buf) {
		logger.info("Unhandled frame: (" + in.getOpCode() + ")");
	}

}