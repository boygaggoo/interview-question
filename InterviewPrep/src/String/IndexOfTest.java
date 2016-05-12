package String;

import static org.junit.Assert.*;

import org.junit.Test;

public class IndexOfTest {

	@Test
	public void test() {
		assertEquals(1, IndexOf.find("hworld","world"));
		assertEquals(2, IndexOf.find("h world","world"));
	}

}
