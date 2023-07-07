package lab5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public abstract class Employee {
    static int numEmps = 0;
    int id;
    String name;
    int grade;
    int joinedYr;
    int joinedMo;
    int joinedDd;
    public Employee(String fn, String ln, int grd, LocalDate joined) {
        numEmps++;
        id = numEmps;
        name = fn + " " + ln;
        grade = grd;
        joinedYr = joined.getYear();
        joinedMo = joined.getMonthValue();
        joinedDd = joined.getDayOfMonth();
    }
    public static int getNumEmployees() {
        return numEmps;
    }
    public String toString() {
    	return id + ": " + name + " \t// " + grade + " // " + 
    			String.format("%02d", joinedDd) + "-" + String.format("%02d", joinedMo) + "-" + String.format("%04d", joinedYr);
    	
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
}