package String;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

	@Test
	public void test() {
		assertEquals(true, Anagram.isAnagramSimple("army","mary"));
		assertEquals(false, Anagram.isAnagramSimple("hello","mary"));
		assertEquals(false, Anagram.isAnagram("hello","mary"));
		assertEquals(true, Anagram.isAnagram("army","mary"));
	}

}
