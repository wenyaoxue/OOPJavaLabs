package bankingsystem;

public class MinAccountBalValidation {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccAmount(5000);
		
		if (acc.getAccAmount() < 500)
			System.out.println("The balance is below minimum value");
		else
			System.out.println("Balance is " + acc.getAccAmount());
	}
}
