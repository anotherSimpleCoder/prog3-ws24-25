package uebung2.task3;

import java.util.List;
import java.util.Optional;

public class CustomerService {
	private List<Customer> customers;
	
	public Optional<Customer> findCustomerById(String id) {
		return this.customers.stream()
				.filter(customer -> customer.customerId().equals(id))
				.findFirst();
	}
	
	public String getCustomerNameUppercase(String id) {
		return this.findCustomerById(id)
						.map(customer -> customer.name().toUpperCase())
						.orElse("UNKNOWN");
	}
	
	public Customer findCustomerOrThrow(String id) {
		return this.findCustomerById(id)
				.orElseThrow(IllegalArgumentException::new);
	}
}
