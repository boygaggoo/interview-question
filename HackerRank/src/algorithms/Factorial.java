package algorithms;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(findFactorial(n));
    }

	private static BigInteger findFactorial(int n) {
		if(n<=1){
			return BigInteger.ONE;
		}
		return  new BigInteger(Integer.toString(n)).multiply(findFactorial(n-1));
		
	}
}
