package lab5;

import java.time.LocalDate;

public class TechnicalAssociatePerm extends PermanentEmployee {

	private int numCerts;
	
	public TechnicalAssociatePerm(String fn, String ln, int grd, LocalDate joined, double yrsExp, int numCerts) {
		super(fn, ln, grd, joined, yrsExp);
		this.numCerts = numCerts;
	}

	@Override
	public double getMediclaim() {
		return getSalary()*2;
	}

	@Override
	public double getSalary() {
		return 5000*yrsExp + 1000*numCerts; 
	}
	@Override
	public String toString() {
		return id + " " + name + " TA-P " + yrsExp + " yrs experience";
	}
	
}
