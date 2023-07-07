package lab4;

import java.time.LocalDate;

public class ContractEmployee extends Employee {

	double rateperhr;
	double numhrsworked;
	String contractorName;
	
	public ContractEmployee(String fn, String ln, double rateperhr, int grd, LocalDate joined) {
		super(fn, ln, 0, grd, joined);
		this.rateperhr = rateperhr;
	}
	public void setHrs(double hrs) {
		numhrsworked = hrs;
	}
	@Override
	public double getSalary() {
		return rateperhr*numhrsworked;
	}
	@Override
	public double getMediclaim() {
		return 0;
	}
}
