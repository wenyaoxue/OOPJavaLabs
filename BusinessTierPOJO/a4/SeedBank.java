package a4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SeedBank {
	private static final CustomerDB customerDB = new CustomerDB();
	private static final Login login = new Login();
	public static void main(String[] args) {
		Customer cust1 = new Customer(1001, "Tan", false);
		customerDB.saveCustomer(cust1);
		login.addLogin(1001, "seed123");

		Customer cust2 = new Customer(1002, "John", true);
		customerDB.saveCustomer(cust2);
		login.addLogin(1002, "seed123");

		Customer cust3 = new Customer(1003, "Sam", true);
		customerDB.saveCustomer(cust3);
		login.addLogin(1003, "Mys@123");

		Customer cust4 = new Customer(1004, "Raj", false);
		customerDB.saveCustomer(cust1);
		login.addLogin(1004, "Asreet-Tech.com123");
		
		List<Customer> customerList = customerDB.getAllCustomers();
		if (customerList.isEmpty())
			System.out.println("No Customers in the Bank");
		else
			printCustomerList(customerList);
		
		Set<Integer> loanAvailedCustomers = customerDB.getLoanAvailedCustomers();
		System.out.println("\nCustomers who have Availed the loan");
		System.out.println("-------------------------------------");
		for (int custId:loanAvailedCustomers)
			System.out.println(custId);
	}
	public static void printCustomerList(List<Customer> customerList) {
		Iterator<Customer> custIterator = customerList.iterator();
		System.out.println("        Customer Details");
		System.out.println("------------------------------");
		System.out.println("cust Id\tcustomer Name\tLoan Availed");
		while (custIterator.hasNext()) {
			Customer customer = custIterator.next();
			System.out.print(customer.getCustomerId()+"\t");
			System.out.print(customer.getCustomerName() + "\t\t");
			
			String displayString = "NO";
			if (customer.isLoanAvailed())
				displayString="YES";
			System.out.println(displayString);
		}
		
	}
}
