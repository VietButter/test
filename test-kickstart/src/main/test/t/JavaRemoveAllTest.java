package t;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JavaRemoveAllTest {

	@Test
	public void test() {
				
		List<String> la = new ArrayList<String>();
		la.add("A");la.add("B");
		List<String> lb = new ArrayList<String>();
		lb.add("C");lb.add("B");
		List<String> lc = new ArrayList<String>();
		
		la.removeAll(lb);
		System.out.println(la);
		System.out.println(lb);
		System.out.println(lc);
		la.addAll(lb);
		System.out.println(la);
		System.out.println(lb);
		System.out.println(lc);
		
		assertEquals("A", "A", "A");		
	}
}
