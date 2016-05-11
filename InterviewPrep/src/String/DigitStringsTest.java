package String;

import static org.junit.Assert.*;

import org.junit.Test;

public class DigitStringsTest {

	@Test
	public void test() {
//		assertEquals(true, DigitStrings.isOnlyDigits("123"));
//		assertEquals(false, DigitStrings.isOnlyDigits("123abs"));
		System.out.println("hello this is an example".replaceAll("\\s", ""));
		assertEquals(false, DigitStrings.isOnlyDigits2("123abs"));
		assertEquals(true, DigitStrings.isOnlyDigits2("123"));
	}

}
