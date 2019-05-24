package library;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import library.interfaces.CheckInInterface;
import library.item.Item;

public class LibraryManagementSystem implements CheckInInterface {

	private List<Item> items = new ArrayList<>();

	@Override
	public void checkInItem(Item item) {
		item.setCheckStatus(CheckStatus.IN);
		item.getCustomer().removeItemFromCustomer(item);
	}

	@Override
	public void checkOutItem(Customer customer, Item item) {
		if (item.getCheckStatus() == CheckStatus.IN) {
			customer.addItemToCustomer(item);
			item.setCustomer(customer);
			item.setCheckStatus(CheckStatus.OUT);
		} else {
			System.out.println("Item has already been checked out");
		}
	}

	@Override
	public void addItem(Item item) {
		items.add(item);
	}

	public Item getItem(String itemId) {
		return items.stream().filter(x -> x.getId().equalsIgnoreCase(itemId)).findFirst().get();
	}

	@Override
	public void removeItem(Item item) {
		items.remove(item);
	}

	public void queryItemAvailability(String itemName) {
		Predicate<Item> filter = x -> x.getItemName().toLowerCase().contains(itemName.toLowerCase())
				&& x.getCheckStatus() == CheckStatus.IN;

		Consumer<Item> printOut = x -> System.out.println("id: " + x.getId() + " || Item Name: " + x.getItemName());

		items.stream().filter(filter).forEach(printOut);
	}

	public void queryWhichCustomerHasItem(String itemId) {
		System.out.println(items.stream().filter(x -> x.getId().equalsIgnoreCase(itemId)).findFirst().get()
				.getCustomer().toString());
	}
}