package datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArraysPracticeTest {

	@Test
	public void arrayDeclarationTest() {
		int [] a={1,2, 2, 3, 4,4, 5,6,7,9};;
		int [] b=new int[]{1,100,2,3,5,8,-2,-8,282,121,-121};
		int [] c={1, 2, 3, 4, 5};
		System.out.println(ArraysPractice.maxMin(b));
		//ArraysPractice.print(b);
		System.out.println();
	//	ArraysPractice.print(ArraysPractice.reverse3(b));
		//System.out.println(ArraysPractice.findMissingInteger(a,10));
//		ArraysPractice.printPairs(a,5);
//		ArraysPractice.printPairsPerfect(a,10);
		//ArraysPractice.print(a);
		//ArraysPractice.print(ArraysPractice.removeDuplicates(a));
		ArraysPractice.print(ArraysPractice.midThree(c));
	}

}
