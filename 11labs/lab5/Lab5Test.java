package lab5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

public class Lab5Test {

	@Test
	void test() {
        assertEquals(0, Employee.getNumEmployees());
        //wage 30
        ContractEmployee tac = new TechnicalAssociateContr("Crystal", "Wen", 1, LocalDate.parse("31-12-2018", DateTimeFormatter.ofPattern("dd-MM-uuuu")), 30);
        assertEquals(1, Employee.getNumEmployees());
        //10 yrs exp, 5 certs
        Employee tap = new TechnicalAssociatePerm("John", "Lee", 1, LocalDate.parse("31-12-2018", DateTimeFormatter.ofPattern("dd-MM-uuuu")), 10, 5);
        //8 yrs exp
        Employee pm = new ProjectManager("James", "Madison", 1, LocalDate.parse("31-12-2018", DateTimeFormatter.ofPattern("dd-MM-uuuu")), 8);
        assertEquals(3, Employee.getNumEmployees());
        
        assertEquals(8*10000, pm.getSalary());
        assertEquals(10*5000+5*1000, tap.getSalary());
        
        tac.setHrs(20);
        assertEquals(600, tac.getSalary());
        tac.setHrs(60);
        assertEquals(2400, tac.getSalary());
        
        assertEquals("1 Crystal Wen TA-C", tac.toString());
        assertEquals("2 John Lee TA-P 10.0 yrs experience", tap.toString());
        assertEquals("3 James Madison PM 8.0 yrs experience", pm.toString());
	}

}
