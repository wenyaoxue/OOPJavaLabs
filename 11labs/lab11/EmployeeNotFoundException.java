package lab11;

public class EmployeeNotFoundException extends Exception {
	public EmployeeNotFoundException(int id) {
		super("Employee id " + id + " not found in this repo");
	}
}
