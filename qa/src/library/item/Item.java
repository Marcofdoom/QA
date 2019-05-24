package library.item;

import library.CheckStatus;
import library.Customer;

public abstract class Item {

	private static int counter;

	protected String itemId;

	protected String itemName;
	protected CheckStatus checkStatus;
	protected Customer customer;

	public Item(String itemName) {
		itemId = "" + itemName.charAt(0) + (++counter);
		this.itemName = itemName;
		this.checkStatus = CheckStatus.IN;
	}

	public String getItemName() {
		return itemName;
	}

	public String getId() {
		return itemId;
	}

	public CheckStatus getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(CheckStatus checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return itemId;
	}
}