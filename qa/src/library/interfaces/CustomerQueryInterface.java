package library.interfaces;

import library.Customer;

public interface CustomerQueryInterface {

	void registerCustomer(Customer customer);

	void deleteCustomer(String customerId);

	void updateCustomer(String customerId);

	void findCustomers(String name);
	
	Customer findCustomer(String name);
}