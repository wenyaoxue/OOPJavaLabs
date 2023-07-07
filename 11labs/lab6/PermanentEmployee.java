package lab6;

import java.time.LocalDate;

public abstract class PermanentEmployee extends Employee {
	double yrsExp;
	public PermanentEmployee(String fn, String ln, int grd, LocalDate joined, double yrsExp) {
		super(fn, ln, grd, joined);
		this.yrsExp = yrsExp;
	}
}
