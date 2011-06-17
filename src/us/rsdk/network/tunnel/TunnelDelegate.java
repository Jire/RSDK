package us.rsdk.network.tunnel;

import java.util.BitSet;

import us.rsdk.network.tunnel.components.events.*;

/**
 * Delegates tunnel events towards their appropriate handlers.
 * 
 * <p>If we wanted to tunnel the event {@link Tag#CANCEL} we could register
 * the tag. Once the tunnel cycle completes the event is executed and the event
 * is unregistered automatically.</p>
 * 
 * @author Thomas Nappo
 */
public class TunnelDelegate {
	
	// bits are entailed as true being active
	// or false being inactive at the ordinal
	// value of each tunnel tag.
	private final BitSet data = new BitSet();
	
	/**
	 * Registers a tunneling event.
	 * @param tag The tunneling tag of the event.
	 */
	public void register(Tag tag) {
		data.set(tag.ordinal(), true);
	}
	
	/**
	 * Unregisters a tunneling event.
	 * @param tag The tunneling tag of the event.
	 */
	public void unregister(Tag tag) {
		data.set(tag.ordinal(), false);
	}
	
	/**
	 * A tunnel event tag. Each tag is associated with
	 * a {@link TunnelHandler} in which it also passes arguments for
	 * a more broken-down handle process.
	 * @author Thomas Nappo
	 */
	public static enum Tag {
		
		/**
		 * <b>Tunnels:</b> {@link CancelEvent}
		 */
		CANCEL(new CancelEvent(), Sub.RUN_ONCE);
		
		/**
		 * The child tag which tells what to do
		 * when the {@link #handler} is executed.
		 */
		public final Sub sub;
		
		/**
		 * Tells what to do with the event once executed.
		 * @author Thomas Nappo
		 */
		private enum Sub {
			
			/**
			 * The handler will run continuously.
			 */
			RUN,
			
			/**
			 * The hander will run once.
			 */
			RUN_ONCE,
			
			/**
			 * The handler will be put on queue.
			 */
			QUEUED;
			
		}
		
		// the associated handler instance
		private final TunnelHandler handler;
		
		/**
		 * @return The tag's associated {@link TunnelHandler}.
		 */
		public TunnelHandler getHandler() {
			return handler;
		}
		
		/**
		 * Constructs a new tunnel event tag.
		 * @param handler The tag's associated {@link TunnelHandler}.
		 * @param sub
		 */
		Tag(TunnelHandler handler, Sub sub) {
			this.handler = handler;
			this.sub = sub;
		}
		
	}

}