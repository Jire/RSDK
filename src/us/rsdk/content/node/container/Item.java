package us.rsdk.content.node.container;

/**
 * Represents a game item space which can 
 * be stored in a {@link Container}.
 * @author Thomas Nappo
 */
public class Item {
	
	private final int id;
	private int amount;
	
	/**
	 * Gets the item's id.
	 * @return The item's {@link #id}
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Gets the amount of items in the slot.
	 * @return The item's {@link #amount}
	 */
	public int getAmount() {
		return amount;
	}
	
	/**
	 * Sets the amount of item in the slot.
	 * @param amount The new amount.
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	/**
	 * Constructs a new item.
	 * @param id The item's id.
	 * @param amount The amount of items in the slot.
	 */
	public Item(int id, int amount) {
		this.id = id;
		this.amount = amount;
	}
	
	/**
	 * Constructs a new item.
	 * @param id The item's id.
	 */
	public Item(int id) {
		this(id, 1);
	}

}