package library;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import library.interfaces.CustomerQueryInterface;

public class CustomerDatabase implements CustomerQueryInterface {

	private Set<Customer> customerSet = new HashSet<Customer>();

	@Override
	public void registerCustomer(Customer customer) {
		customerSet.add(customer);
	}

	@Override
	public void deleteCustomer(String customerId) {
		customerSet.removeIf(x -> x.getCustomerId().equals(customerId));
	}

	@Override
	public void updateCustomer(String customerId) {
		// TODO Auto-generated method stub
	}

	@Override
	public void findCustomers(String name) {
		Set<Customer> set = (HashSet<Customer>) customerSet.stream()
				.filter(x -> x.getFirstName().equalsIgnoreCase(name)).collect(Collectors.toSet());
		System.out.println(set);
	}

	@Override
	public Customer findCustomer(String customerId) {
		return customerSet.stream().filter(x -> x.getCustomerId().equals(customerId)).findFirst().get();
	}
}