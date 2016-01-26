package chap3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyQueue3_5Test {
	static MyQueue3_5 q;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	q=new MyQueue3_5();
	}

	@Before
	public void setUp() throws Exception {
	q.push(1);
	q.push(2);
	}

	@Test
	public void test() {
		assertEquals(1, q.pop());
		q.push(3);
		assertEquals(2,q.peek());
	}

}
