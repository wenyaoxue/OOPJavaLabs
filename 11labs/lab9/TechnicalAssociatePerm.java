package lab9;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class TechnicalAssociatePerm extends PermanentEmployee {

	private int numCerts;
	
	public TechnicalAssociatePerm(String fn, String ln, int grd, GregorianCalendar joined, double yrsExp, String[] potCerts) {
		super(fn, ln, grd, joined, yrsExp);
		for (String cert: potCerts)
			if (cert.equals("SCJP") || cert.equals("SCWCD") || cert.equals("SCBCD"))
				certs.add(cert);
			else
				System.out.println(cert + " is not a valid/relevant certification for a technical associate");
		this.numCerts = certs.size();
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
		String retVal = id + " " + name + " TA-P " + yrsExp + " yrs experience\nCertifications: ";
		for (int i = 0; i < certs.size(); i++)
			if (i == certs.size()-1)
				retVal+=certs.get(i)+"\n";
			else
				retVal+=certs.get(i)+"/";
		retVal += "Joined " + formatJoined();
		return retVal;
	}
	
}
