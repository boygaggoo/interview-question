package String;

import static org.junit.Assert.*;

import org.junit.Test;

public class VowelsFindTest {

	@Test
	public void test() {
		assertEquals(2,VowelsFind.find("hello"));
		assertEquals(4,VowelsFind.find("helaloi"));
	}

}
