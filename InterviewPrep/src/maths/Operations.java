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

	/**
	 * The requirement is to multiply with only using
	 * the + operator
	 * @param i
	 * @param j
	 * @return 
	 */
	public static int multiply(int n, int m) {
	    int sol=0;
		for(int i=0;i<m;i++){
		    sol+=n;
		}
		return sol;
	}
	/**
	 * The requirement is to divide with only using
	 * the + operator
	 * @param numerator
	 * @param denominator
	 * @return 
	 */

	public static int divide(int num, int deno) {
		// TODO Auto-generated method stub
		int result=0;
		int sol=0;
		while(sol<num){
		     result+=1;
		     sol+=deno;
			}
		return result;
	}
/**
 * Subtracting two numbers without using '-' operator
 * @param a
 * @param b
 * @return
 */
	public static int substract(int a, int b) {
		int count=0;
		for(int i=b;i<a;i++){
			count++;
		}
		if(a<b){
			for(int i=a;i<b;i++){
				count++;
			}
			return -count;
		}
		return count;
	}

}
