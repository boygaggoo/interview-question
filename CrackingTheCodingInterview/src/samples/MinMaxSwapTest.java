package samples;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class MinMaxSwapTest {

	@Test
	public void test() {
		int [] a={1,2,3,4,5};
	   MinMaxSwap.swap(a);
	   for(Integer i:a){
		   System.out.print(i+",");
	   }
//	   System.out.println((Arrays.asList(a)));
	}

}
