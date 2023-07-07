package lab9;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class TechnicalAssociateContr extends ContractEmployee {

	public TechnicalAssociateContr(String fn, String ln, int grd, GregorianCalendar joined, double wage, String[] potCerts) {
		super(fn, ln, grd, joined, wage);
		for (String cert: potCerts)
			if (cert.equals("SCJP") || cert.equals("SCWCD") || cert.equals("SCBCD"))
				certs.add(cert);
			else
				System.out.println(cert + " is not a valid/relevant certification for a technical associate");
	}

	@Override
	public double getSalary() {
		if (hrs <= 40)
			return wage*hrs;
		return 40 * wage + (hrs - 40) * wage * 2;
	}
	@Override
	public String toString() {
		String retVal = id + " " + name + " TA-C\nCertifications: ";
		for (int i = 0; i < certs.size(); i++)
			if (i == certs.size()-1)
				retVal+=certs.get(i)+"\n";
			else
				retVal+=certs.get(i)+"/";
		retVal += "Joined " + formatJoined();
		return retVal;
	}
}
