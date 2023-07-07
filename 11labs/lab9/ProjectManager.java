package lab9;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class ProjectManager extends PermanentEmployee {

	public ProjectManager(String fn, String ln, int grd, GregorianCalendar joined, double yrsExp, String[] potCerts) {
		super(fn, ln, grd, joined, yrsExp);
		for (String cert: potCerts)
			if (cert.equals("PMI"))
				certs.add(cert);
			else
				System.out.println(cert + " is not a valid/relevant certification for a project manager");
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
		String retVal = id + " " + name + " PM " + yrsExp + " yrs experience\nCertifications: ";
		for (int i = 0; i < certs.size(); i++)
			if (i == certs.size()-1)
				retVal+=certs.get(i)+"\n";
			else
				retVal+=certs.get(i)+"/";
		retVal += "Joined " + formatJoined();
		return retVal;
	}
}
