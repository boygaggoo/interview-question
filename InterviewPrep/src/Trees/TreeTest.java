package Trees;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TreeTest {
	static Tree t;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	t=new Tree("a");
	}
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Tree nw=new Tree("b");
		t.addChild(nw);
		System.out.println(t.getChild());
	}
	@Test
	public void sizeTest(){
		Tree nw=new Tree("b");
		t.addChild(nw);
		nw.addChild(new Tree("c"));
		assertEquals(4,t.size());
	}

}
