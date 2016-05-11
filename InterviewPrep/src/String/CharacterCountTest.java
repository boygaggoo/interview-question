package String;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterCountTest {

	@Test
	public void test() {
		System.out.println(CharacterCount.findCharCount("Java"));
		System.out.println(CharacterCount.findCharCount("rat"));
		System.out.println(CharacterCount.findCharCount(""));
	}

}
