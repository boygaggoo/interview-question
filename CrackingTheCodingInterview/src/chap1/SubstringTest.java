package chap1;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

public class SubstringTest {

	@Test
	public void test() {
//		System.out.println("erbottlewaterbottlewat".indexOf("waterbottle"));
	
		assertEquals(true,Substring.isRotation("erbottlewat","waterbottle"));
	}

}
