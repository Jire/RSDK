package us.rsdk.content.bundle;

/**
 * If an activator is present in a bundle package it handles
 * bundle activation and deactivation.
 * @author Thomas Nappo
 */
public interface Activator {
	
	/**
	 * Called when the bundle is started.
	 * @param ctx The bundle's {@link Context} attachment.
	 */
	public void start(Context<?> ctx);
	
	/**
	 * Called when the bundle is stopped.
	 * @param ctx The bundle's {@link Context} attachment.
	 */
	public void stop(Context<?> ctx);

}