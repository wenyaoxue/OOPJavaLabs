package lab2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

class Employee2Test {

	@Test
	void test() {
        assertEquals(0, Employee2.getNumEmployees());
        Employee2 emp1 = new Employee2("Crystal", "Wen", 100000.99, 1, LocalDate.parse("31-12-2018", DateTimeFormatter.ofPattern("dd-MM-uuuu")));
        assertEquals(1, Employee2.getNumEmployees());
	}

}
