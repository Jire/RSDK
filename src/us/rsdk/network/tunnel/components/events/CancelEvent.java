package us.rsdk.network.tunnel.components.events;

import us.rsdk.network.tunnel.TunnelDelegate.Tag;
import us.rsdk.network.tunnel.TunnelHandler;

/**
 * Cancels the next event to be executed.
 * @author Thomas Nappo
 */
public class CancelEvent implements TunnelHandler {

	@Override
	public void handle(Tag tag) {
		switch (tag.sub) {
		case RUN_ONCE:
		default: // TODO: Implement handling for other executions
			
			break;
		}
	}

}