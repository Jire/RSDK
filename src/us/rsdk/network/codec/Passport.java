package us.rsdk.network.codec;

import us.rsdk.content.model.player.Player;

/**
 * A small generic authentication we can use to store the little
 * number of fields needed for authentication of a user.
 * 
 * <h3>Why This Approach?</h3>
 * <p>Creating a tiny passport object during authentication prevents
 * the creation of uneeded fields. We can later use the passport as a
 * field inside of the large {@link Player} object.</p>
 * 
 * @author Thomas Nappo
 */
public class Passport {
	
	private final String username, password;
	
	/**
	 * @return The username identifier of the passport.
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * @return The password authentication of the passport.
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Constructs a new passport.
	 * @param username The username identifier of the passport.
	 * @param password The password authentication of the passport.
	 */
	public Passport(String username, String password) {
		this.username = username;
		this.password = password;
	}

}