package chap1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCompressionTest {

	@Test
	public void test() {
		String str=StringCompression.compress("aabccaaaddcfff");
			assertEquals("a2b1c2a3d2c1f3", str);
	}

}
