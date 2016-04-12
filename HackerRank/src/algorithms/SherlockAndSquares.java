package algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Watson gives two integers (AA and BB) to Sherlock and 
 * asks if he can count the number of square integers
 *  between AA and BB (both inclusive).

Note: A square integer is an integer which is the square of any integer. 
For example, 1, 4, 9, and 16 are some of the square integers as they are squares of 1, 2, 3, and 4, respectively.
 * @author Siddiq Ahmed Syed
 *
 */
public class SherlockAndSquares {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int T=in.nextInt();
	for (int i=0;i<T;i++){
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println(findCountOfSquares(a,b));
		System.out.println(secondSol(a,b));
	}
	
	
}

private static int findCountOfSquares(int a, int b) {
	int count=0;
	for(int i=a;i<=b;i++){
		double num=Math.sqrt(i);
		long iPart=(long)num;
		double fPart=num-iPart;
//		System.out.println(i+", sqrt:"+num);
		if(fPart==0.0){
			count++;
		}
		
	}
	return count;
	
}
private static int secondSol(int start,int end){
	int count=0;
	int a = (int)Math.pow(start, .5);
	System.out.println(a);
    for(; a <= end; a++){
        if(a*a >= start && a*a <= end)
            count++;
        else if(a*a > end)
            break;
    }
   return count;
}
}
