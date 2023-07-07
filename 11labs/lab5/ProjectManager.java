package lab5;

import java.time.LocalDate;

public class ProjectManager extends PermanentEmployee {

	public ProjectManager(String fn, String ln, int grd, LocalDate joined, double yrsExp) {
		super(fn, ln, grd, joined, yrsExp);
	}

	@Override
	public double getMediclaim() {
		return getSalary();
	}

	@Override
	public double getSalary() {
		return 10000 * yrsExp;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " PM " + yrsExp + " yrs experience";
	}
}
