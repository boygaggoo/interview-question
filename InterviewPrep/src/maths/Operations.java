package maths;

public class Operations {

	/**
	 * The requirement is to swap numbers without using
	 * additional variable
	 * @param i
	 * @param j
	 */
	public static void swapNumbers(int i, int j) {
		 System.out.println("Value i:"+i+"\n Value of j:"+j);
	     i=j-i;
		 j=j-i;
	     i=i+j;
	     System.out.println("Value i:"+i+"\n Value of j:"+j);
	}

}
