package String;

import static org.junit.Assert.*;

import org.junit.Test;

public class PanagramTest {

	@Test
	public void test() {
		String test1=Panagram.getMissingLetters("A quick brown fox jumps over the lazy dog");
		String test2=Panagram.getMissingLetters("A slow yellow fox crawls under the proactive dog");
		String test3=Panagram.getMissingLetters("Lions, and tigers, and bears, oh my!");
		String test4=Panagram.getMissingLetters("");
		
		assertEquals("", test1);
		assertEquals( "bjkmqz",test2);
		assertEquals("cfjkpquvwxz",test3);
		assertEquals("abcdefghijklmnopqrstuvwxyz", test4);
		
	}

}
