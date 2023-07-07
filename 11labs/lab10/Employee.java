package lab10;

import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Calendar;

public abstract class Employee implements Certification {
    protected static int numEmps = 0;
    protected static ArrayList<Employee> emprepo = new ArrayList<Employee>();
    protected int id;
    protected String name;
    protected int grade;
    protected int joinedYr;
    protected int joinedMo;
    protected int joinedDd;
    protected ArrayList<String> certs;
    public Employee(String fn, String ln, int grd, GregorianCalendar joined) {
        numEmps++;
        id = numEmps;
        name = fn + " " + ln;
        grade = grd;
        joinedYr = joined.get(Calendar.YEAR);
        joinedMo = joined.get(Calendar.MONTH)+1;
        joinedDd = joined.get(Calendar.DATE);
//        System.out.println(joinedYr);
//        System.out.println(joinedMo);
//        System.out.println(joinedDd);
        certs = new ArrayList<String>();
        emprepo.add(this);
    }
    public static int getNumEmployees() {
        return numEmps;
    }
    public String toString() {
    	return id + ": " + name + " \t// " + grade + " // " + 
    			String.format("%02d", joinedDd) + "-" + String.format("%02d", joinedMo) + "-" + String.format("%04d", joinedYr);
    	
    }
    protected String formatJoined() {
    	return String.format("%02d", joinedDd) + "-" + String.format("%02d", joinedMo) + "-" + String.format("%04d", joinedYr);
    }
	public void setJoinedYr(int joinedYr) {
		this.joinedYr = joinedYr;
	}
	public void setJoinedMo(int joinedMo) {
		this.joinedMo = joinedMo;
	}
	public void setJoinedDd(int joinedDd) {
		this.joinedDd = joinedDd;
	}
	public abstract double getSalary();
	public abstract double getMediclaim();
	@Override
	public ArrayList<String> getCerts() {
		return certs;
	}
	public static Employee searchRepo(int tgtId) throws EmployeeNotFoundException {
		for (Employee emp: emprepo)
			if (emp.getId()==tgtId)
				return emp;
		throw new EmployeeNotFoundException(tgtId);
				
	}
	private int getId() {
		return id;
	}
}