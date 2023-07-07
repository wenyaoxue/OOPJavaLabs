package lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Employee1Test {

	@Test
	void test() {
        assertEquals(0, Employee1.getNumEmployees());
        Employee1 emp1 = new Employee1("Crystal", "Wen", 100000.99, 1, "2023:06");
        Employee1 emp2 = new Employee1("John", "Lee", 100000.99, 1, "2023:06");
//        System.out.println(emp1);
//        System.out.println(emp2);
        assertEquals(2, Employee1.getNumEmployees());
	}

}
