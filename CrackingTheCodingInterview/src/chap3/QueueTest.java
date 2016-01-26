package chap3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QueueTest {
	static Queue q;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	 q=new Queue();
	}

	

	@Test
	public void addTest() {
	 q.add(1);
	 assertEquals(1, q.size());
	 q.add(2);
	 q.add(3);
	 assertEquals(3, q.size());
	}
	@Test
	public void removeTest() {
	 q.add(1);
     System.out.println(q.remove());
     q.add(2);
     q.add(3);
     assertEquals(2, q.remove());
	}

}
