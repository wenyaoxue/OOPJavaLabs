package lab9;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public abstract class PermanentEmployee extends Employee {
	double yrsExp;
	public PermanentEmployee(String fn, String ln, int grd, GregorianCalendar joined, double yrsExp) {
		super(fn, ln, grd, joined);
		this.yrsExp = yrsExp;
	}
}
