package lab3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

public class Lab3Test {

	@Test
	void test() {
        assertEquals(0, Employee.getNumEmployees());
        ContractEmployee emp1 = new ContractEmployee("Crystal", "Wen", 80, 1, LocalDate.parse("31-12-2018", DateTimeFormatter.ofPattern("dd-MM-uuuu")));
        assertEquals(1, Employee.getNumEmployees());
        PermanentEmployee emp2 = new PermanentEmployee("John", "Lee", 100000.99, 1, LocalDate.parse("31-12-2018", DateTimeFormatter.ofPattern("dd-MM-uuuu")));
        assertEquals(2, Employee.getNumEmployees());
        
        emp1.setHrs(20);
        assertEquals(1600, emp1.getSalary());
        assertEquals(100000.99, emp2.getSalary());
	}

}
