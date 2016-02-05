package map;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomHashMapTest {

	@Test
	public void test() {
		CustomHashMap<String, String> key=new CustomHashMap<>();
		key.put("hello", "world");
		assertEquals("world", key.get("hello"));
	}

}
