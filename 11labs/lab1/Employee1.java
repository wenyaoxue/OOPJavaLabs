package lab1;

public class Employee1 {
    static int numEmps = 0;
    int id;
    String name;
    double salary;
    int grade;
    int joinedYr;
    int joinedMo;
    public Employee1(String fn, String ln, double sal, int grd, String joined) {
        numEmps++;
        id = numEmps;
        name = fn + " " + ln;
        salary = sal;
        grade = grd;
        joinedYr = Integer.parseInt(joined.substring(0, 4));
        joinedMo = Integer.parseInt(joined.substring(5, 7));
    }
    public static int getNumEmployees() {
        return numEmps;
    }
    public String toString() {
    	return id + ": " + name + " \t| $" + salary + " // " + grade + " // " + joinedYr + "/" + joinedMo;
    	
    }
}