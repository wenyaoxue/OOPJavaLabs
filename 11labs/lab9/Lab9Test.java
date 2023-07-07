package lab9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

public class Lab9Test {

	@Test
	void test() throws ParseException, EmployeeNotFoundException {
        assertEquals(0, Employee.getNumEmployees());
        //wage 30
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = df.parse("31-12-2018");
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        ContractEmployee tac = new TechnicalAssociateContr("Crystal", "Wen", 1, 
        		cal, 30, 
        		new String[] {"a", "b", "SCJP"});
        assertEquals(1, Employee.getNumEmployees());
        //10 yrs exp, 2 certs
        Employee tap = new TechnicalAssociatePerm("John", "Lee", 1, 
        		cal, 10, 
        		new String[] {"PMI", "SCWCD", "SCBCD"});
        //8 yrs exp
        Employee pm = new ProjectManager("James", "Madison", 1, 
        		cal, 8, 
        		new String[]{"PMI", "SCBCD"});
        assertEquals(3, Employee.getNumEmployees());
        
        assertEquals(8*10000, pm.getSalary());
        assertEquals(10*5000+2*1000, tap.getSalary());
        
        tac.setHrs(20);
        assertEquals(600, tac.getSalary());
        tac.setHrs(60);
        assertEquals(2400, tac.getSalary());
        
        assertEquals("1 Crystal Wen TA-C\nCertifications: SCJP\nJoined 31-12-2018", tac.toString());
        assertEquals("2 John Lee TA-P 10.0 yrs experience\nCertifications: SCWCD/SCBCD\nJoined 31-12-2018", tap.toString());
        assertEquals("3 James Madison PM 8.0 yrs experience\nCertifications: PMI\nJoined 31-12-2018", pm.toString());
        
//        Employee findemp = Employee.searchRepo(4); //throws error
        assertEquals("3 James Madison PM 8.0 yrs experience\nCertifications: PMI\nJoined 31-12-2018", Employee.searchRepo(3).toString());
        assertEquals("2 John Lee TA-P 10.0 yrs experience\nCertifications: SCWCD/SCBCD\nJoined 31-12-2018", Employee.searchRepo(2).toString());
	}

}
