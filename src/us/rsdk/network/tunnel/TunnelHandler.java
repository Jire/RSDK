package us.rsdk.network.tunnel;

import us.rsdk.network.tunnel.TunnelDelegate.Tag;

/**
 * Handles a tunneling event.
 * @author Thomas Nappo
 */
public interface TunnelHandler {
	
	/**
	 * Executed when the handler is launched.
	 * @param tag Event tag notifier.
	 */
	public void handle(Tag tag);

}