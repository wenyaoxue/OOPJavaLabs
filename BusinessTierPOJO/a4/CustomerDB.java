package a4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CustomerDB {
	private List<Customer> customerList = new ArrayList<Customer>();
	
	public boolean saveCustomer(Customer customer) {
		boolean status = false;
		status = customerList.add(customer);
		return status;
	}
	
	public List<Customer> getAllCustomers() {
		return customerList;
	}
	
	public Set<Integer> getLoanAvailedCustomers() {
		Set<Integer> loanAvailedCustomers = new TreeSet<Integer>();
		Iterator<Customer> customerIterator = customerList.iterator();
		while (customerIterator.hasNext()) {
			Customer customer = customerIterator.next();
			if (customer.isLoanAvailed())
				loanAvailedCustomers.add(customer.getCustomerId());
		}
		return loanAvailedCustomers;
	}
}
