package String;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstNonRepeatedCharTest {

	@Test
	public void test() {
		assertEquals('h'+"", FirstNonRepeatedChar.find("hello")+"");
		assertEquals('l'+"", FirstNonRepeatedChar.find("hheelo")+"");
		
	}

}
