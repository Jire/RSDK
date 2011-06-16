package us.rsdk.content.bundle;

import java.util.HashMap;
import java.util.Map;

/**
 * Stores context data related to a bundle package. Elements attached
 * to the context can be retrieved at a later time.
 * 
 * <pre>Do not use context for storing metadata.</pre>
 * 
 * @author Thomas Nappo
 * @param <E> The types of elements that can be attached to the context.
 */
public class Context<E> {
	
	// this is just the core map which stores the entries
	private final Map<String, E> data = new HashMap<String, E>();
	
	/**
	 * Attaches an element to the context.
	 * @param key The attachment's identifier key.
	 * @param e The element to attach.
	 */
	public void attach(String key, E e) {
		data.put(key, e);
	}
	
	/**
	 * Retrieves an attachment element from the context.
	 * @param key The identifier key which is used to retrieve the element.
	 * @return The element which is mapped to the key.
	 */
	public E get(String key) {
		return data.get(key);
	}
	
	/**
	 * Removes then retrieves an attachment element from the context.
	 * @param key The identifier key which is used to retrieve the element.
	 * @return The element which is mapped to the key.
	 */
	public E flip(String key) {
		E e = data.get(key);
		data.remove(e);
		return e;
	}

}