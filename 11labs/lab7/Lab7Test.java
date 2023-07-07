
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

import com.seed.employee.Employee;
import com.seed.employee.contract.ContractEmployee;
import com.seed.employee.contract.TechnicalAssociateContr;
import com.seed.employee.permanent.ProjectManager;
import com.seed.employee.permanent.TechnicalAssociatePerm;

public class Lab7Test {

	@Test
	void test() {
        assertEquals(0, Employee.getNumEmployees());
        //wage 30
        ContractEmployee tac = new TechnicalAssociateContr("Crystal", "Wen", 1, 
        		LocalDate.parse("31-12-2018", DateTimeFormatter.ofPattern("dd-MM-uuuu")), 30, 
        		new String[] {"a", "b", "SCJP"});
        assertEquals(1, Employee.getNumEmployees());
        //10 yrs exp, 2 certs
        Employee tap = new TechnicalAssociatePerm("John", "Lee", 1, 
        		LocalDate.parse("31-12-2018", DateTimeFormatter.ofPattern("dd-MM-uuuu")), 10, 
        		new String[] {"PMI", "SCWCD", "SCBCD"});
        //8 yrs exp
        Employee pm = new ProjectManager("James", "Madison", 1, 
        		LocalDate.parse("31-12-2018", DateTimeFormatter.ofPattern("dd-MM-uuuu")), 8, 
        		new String[]{"PMI", "SCBCD"});
        assertEquals(3, Employee.getNumEmployees());
        
        assertEquals(8*10000, pm.getSalary());
        assertEquals(10*5000+2*1000, tap.getSalary());
        
        tac.setHrs(20);
        assertEquals(600, tac.getSalary());
        tac.setHrs(60);
        assertEquals(2400, tac.getSalary());
        
        assertEquals("1 Crystal Wen TA-C\nCertifications: SCJP", tac.toString());
        assertEquals("2 John Lee TA-P 10.0 yrs experience\nCertifications: SCWCD/SCBCD", tap.toString());
        assertEquals("3 James Madison PM 8.0 yrs experience\nCertifications: PMI", pm.toString());
	}

}
