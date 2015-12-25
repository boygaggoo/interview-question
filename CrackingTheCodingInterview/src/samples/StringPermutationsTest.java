package samples;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class StringPermutationsTest {

	@Test
	public void test() {
		String one="a";
		String two="ab";
		System.out.println(two.substring(0,1));
		System.out.println(StringPermutations.permutation("ab"));
//		Assert.assertEquals([,StringPermutations.permutation(one));
//		Assert.assertEquals("",StringPermutations.permutation(two));
	}

}
