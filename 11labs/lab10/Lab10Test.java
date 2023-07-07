package lab10;

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

public class Lab10Test {

	@Test
	void test() throws ParseException, EmployeeNotFoundException {
		ConferenceRoomBookingJob CR = new ConferenceRoomBookingJob();
		
		ThreadDemo T1 = new ThreadDemo("Thread1", CR);
		ThreadDemo T2 = new ThreadDemo("Thread2", CR);
		
        //wage 30
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = df.parse("31-12-2018");
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        
        ProjectManager pm1 = new ProjectManager("James", "Madison", 1, 
        		cal, 8, 
        		new String[]{"PMI", "SCBCD"});
        ProjectManager pm2 = new ProjectManager("John", "Adams", 1, 
        		cal, 8, 
        		new String[]{"PMI", "SCBCD"});
        
        T1.start(pm1);
        T2.start(pm2);
        
        try {
        	T1.join();
        	T2.join();
        } catch (Exception e) {
        	System.out.println("Interrupted");
        }
	}

}
