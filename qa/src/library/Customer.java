package library;

import java.util.HashSet;
import java.util.Set;

import library.item.Item;

public class Customer {

	private static int counter;

	private String customerId;
	private String firstName;
	private String lastName;

	private Set<Item> items = new HashSet<Item>();

	public Customer(String firstName, String lastName) {
		customerId = "" + firstName.charAt(0) + lastName.charAt(0) + (++counter);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void addItemToCustomer(Item item) {
		items.add(item);
	}

	public void removeItemFromCustomer(Item item) {
		items.remove(item);
	}

	@Override
	public String toString() {
		return customerId + " " + firstName + " " + lastName;
	}

	public void queryItems() {
		System.out.println(items);
	}
}