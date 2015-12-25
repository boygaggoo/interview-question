package chap1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReplaceSpacesInStringTest {

	@Test
	public void replaceTest1() {
		String str=ReplaceSpacesInString.replace("Hello World");
		assertEquals("Hello%20World", str);
	}
	@Test
	public void replaceTest2() {
		String str=ReplaceSpacesInString.replace2("Hello World");
		assertEquals("Hello%20World", str);
	}

}
