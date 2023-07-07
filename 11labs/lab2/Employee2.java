package lab2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Employee2 {
    static int numEmps = 0;
    int id;
    String name;
    double salary;
    int grade;
    int joinedYr;
    int joinedMo;
    int joinedDd;
    public Employee2(String fn, String ln, double sal, int grd, LocalDate joined) {
        numEmps++;
        id = numEmps;
        name = fn + " " + ln;
        salary = sal;
        grade = grd;
        joinedYr = joined.getYear();
        joinedMo = joined.getMonthValue();
        joinedDd = joined.getDayOfMonth();
    }
    public static int getNumEmployees() {
        return numEmps;
    }
    public String toString() {
    	return id + ": " + name + " \t| $" + salary + " // " + grade + " // " + 
    			String.format("%02d", joinedDd) + "-" + String.format("%02d", joinedMo) + "-" + String.format("%04d", joinedYr);
    	
    }
}