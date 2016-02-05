package map;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

public class HashMapTest {

	@Test
	public void test() {
		HashMap hm=new HashMap();
		
		hm.put(1,2);
		hm.put(2,3);
		assertEquals(2,hm.get(1));
		assertEquals(3,hm.get(2));
	}

}
