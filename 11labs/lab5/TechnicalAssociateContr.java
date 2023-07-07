package lab5;

import java.time.LocalDate;

public class TechnicalAssociateContr extends ContractEmployee {

	public TechnicalAssociateContr(String fn, String ln, int grd, LocalDate joined, double wage) {
		super(fn, ln, grd, joined, wage);
	}

	@Override
	public double getSalary() {
		if (hrs <= 40)
			return wage*hrs;
		return 40 * wage + (hrs - 40) * wage * 2;
	}
	@Override
	public String toString() {
		return id + " " + name + " TA-C";
	}
}
