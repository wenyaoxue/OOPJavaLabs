package lab4;

import java.time.LocalDate;

public abstract class PermanentEmployee extends Employee {

	public PermanentEmployee(String fn, String ln, double sal, int grd, LocalDate joined) {
		super(fn, ln, sal, grd, joined);
	}
}
