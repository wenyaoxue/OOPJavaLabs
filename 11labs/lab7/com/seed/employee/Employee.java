package com.seed.employee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import com.seed.util.Certification;

public abstract class Employee implements Certification {
    protected static int numEmps = 0;
    protected int id;
    protected String name;
    protected int grade;
    protected int joinedYr;
    protected int joinedMo;
    protected int joinedDd;
    protected ArrayList<String> certs;
    public Employee(String fn, String ln, int grd, LocalDate joined) {
        numEmps++;
        id = numEmps;
        name = fn + " " + ln;
        grade = grd;
        joinedYr = joined.getYear();
        joinedMo = joined.getMonthValue();
        joinedDd = joined.getDayOfMonth();
        certs = new ArrayList<String>();
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
	@Override
	public ArrayList<String> getCerts() {
		return certs;
	}
}