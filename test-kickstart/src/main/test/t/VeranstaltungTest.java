package t;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;
import org.salespointframework.time.Interval;

public class VeranstaltungTest {

	@Test
	public void test() {
		Veranstaltung v = new Veranstaltung();
		LocalDateTime dt1 = LocalDateTime.of(2016, 12, 6, 8, 0);
		LocalDateTime dt2 = LocalDateTime.of(2017, 12, 6, 8, 0);
		
		LocalDateTime dt3 = LocalDateTime.of(2017, 12, 6, 7, 0);
		LocalDateTime dt4 = LocalDateTime.of(2018, 12, 6, 8, 0);
		
		Interval interval = Interval.from(dt1).to(dt2);	
		Interval interval2 = Interval.from(dt3).to(dt4);	
		v.setInterval(interval);
		
		assertEquals("muss false",true,v.getInterval().overlaps(interval2));
		

	}

}
