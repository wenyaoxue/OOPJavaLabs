package lab10;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class ContractEmployee extends Employee {

	double wage;
	double hrs;
	String contractorName;
	
	public ContractEmployee(String fn, String ln, int grd, GregorianCalendar joined, double wage) {
		super(fn, ln, grd, joined);
		this.wage = wage;
	}
	public void setHrs(double hrs) {
		this.hrs = hrs;
	}
	@Override
	public double getSalary() {
		return wage*hrs;
	}
	@Override
	public double getMediclaim() {
		return 0;
	}
}
