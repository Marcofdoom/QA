package library.interfaces;

import library.Customer;
import library.item.Item;

public interface CheckInInterface {

	void checkInItem(Item item);

	void checkOutItem(Customer customer, Item item);

	void addItem(Item item);

	void removeItem(Item item);

	void queryItemAvailability(String itemName);
}