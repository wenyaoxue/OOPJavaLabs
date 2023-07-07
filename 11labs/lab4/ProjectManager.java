package lab4;

import java.time.LocalDate;

public class ProjectManager extends PermanentEmployee {

	public ProjectManager(String fn, String ln, double sal, int grd, LocalDate joined) {
		super(fn, ln, sal, grd, joined);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMediclaim() {
		return salary;
	}
}
