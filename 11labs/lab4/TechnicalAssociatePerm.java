package lab4;

import java.time.LocalDate;

public class TechnicalAssociatePerm extends PermanentEmployee {

	public TechnicalAssociatePerm(String fn, String ln, double sal, int grd, LocalDate joined) {
		super(fn, ln, sal, grd, joined);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMediclaim() {
		return salary*2;
	}
}
