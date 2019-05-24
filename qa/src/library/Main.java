package library;

import library.item.Book;
import library.item.Map;
import library.item.Newspaper;

public class Main {

	private LibraryManagementSystem libraryManagementSystem;
	private CustomerDatabase customerDatabase;

	public static void main(String args[]) {
		new Main();
	}

	public Main() {

		// Create Database Systems
		customerDatabase = new CustomerDatabase();
		libraryManagementSystem = new LibraryManagementSystem();

		// Create Initial Stock
		createInitialStock();

		libraryManagementSystem.queryItemAvailability("Book 1");

		// // Creating customer
		// customerDatabase.registerCustomer(new Customer("Marc", "Partington"));
		//
		// // Assign item to customer
		// libraryManagementSystem.checkOutItem(customerDatabase.findCustomer("MP1"),
		// libraryManagementSystem.getItem("book1"));
	}

	private void createInitialStock() {
		libraryManagementSystem.addItem(new Book("The Steveo Chronicles", "Steve RT Authorson"));
		libraryManagementSystem.addItem(new Book("The Steveo Chronicles", "Steve RT Authorson"));
		libraryManagementSystem.addItem(new Book("The Steveo Retribution", "Steve RT Authorson"));
		libraryManagementSystem.addItem(new Book("Game of Thrones, book 1", "George RR Martington"));
		libraryManagementSystem.addItem(new Book("Game of Thrones, book 1", "George RR Martington"));
		libraryManagementSystem.addItem(new Book("Game of Thrones, book 2", "George RR Martington"));

		libraryManagementSystem.addItem(new Map("map1", "England"));
		libraryManagementSystem.addItem(new Map("map1", "England"));
		libraryManagementSystem.addItem(new Map("map1", "England"));
		libraryManagementSystem.addItem(new Map("map2", "Scotland"));
		libraryManagementSystem.addItem(new Map("map2", "Scotland"));
		libraryManagementSystem.addItem(new Map("map2", "Scotland"));

		libraryManagementSystem.addItem(new Newspaper("newspaper1", true));
		libraryManagementSystem.addItem(new Newspaper("newspaper1", true));
		libraryManagementSystem.addItem(new Newspaper("newspaper1", true));
		libraryManagementSystem.addItem(new Newspaper("newspaper2", false));
		libraryManagementSystem.addItem(new Newspaper("newspaper2", false));
		libraryManagementSystem.addItem(new Newspaper("newspaper2", false));
	}
}