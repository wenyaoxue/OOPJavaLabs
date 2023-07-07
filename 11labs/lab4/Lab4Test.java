package lab4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

public class Lab4Test {

	@Test
	void test() {
        assertEquals(0, Employee.getNumEmployees());
        ContractEmployee emp1 = new TechnicalAssociateContr("Crystal", "Wen", 80, 1, LocalDate.parse("31-12-2018", DateTimeFormatter.ofPattern("dd-MM-uuuu")));
        assertEquals(1, Employee.getNumEmployees());
        PermanentEmployee emp2 = new TechnicalAssociatePerm("John", "Lee", 10000, 1, LocalDate.parse("31-12-2018", DateTimeFormatter.ofPattern("dd-MM-uuuu")));
        PermanentEmployee emp3 = new ProjectManager("James", "Madison", 10000, 1, LocalDate.parse("31-12-2018", DateTimeFormatter.ofPattern("dd-MM-uuuu")));
        assertEquals(3, Employee.getNumEmployees());
        
        emp1.setHrs(20);
        assertEquals(1600, emp1.getSalary());
        assertEquals(10000, emp2.getSalary());
        assertEquals(0, emp1.getMediclaim());
        assertEquals(20000, emp2.getMediclaim());
        assertEquals(10000, emp3.getMediclaim());
	}

}
