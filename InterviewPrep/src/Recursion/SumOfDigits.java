package Recursion;

/**
 * 
 Sum of digits of 123 is 6
 * @author siddiq
 *
 */

public class SumOfDigits {
public static void main(String[] args) {
//	System.out.println(123/10);
//	System.out.println(123%10);
	System.out.println(sumofDigits(123));
	System.out.println(sumofDigitsIterative(123));
}

private static int sumofDigits(int num) {
	// TODO Auto-generated method stub
	if(num==0){
		return 0;
	}
	return (num%10)+sumofDigits(num/10);
	}

private static int sumofDigitsIterative(int num) {
	// TODO Auto-generated method stub
	int result=0;
	while(num>0){
	    int q=num%10;
	    num=num/10;
	    result+=q;
	    System.out.println("Value of result"+result);
	    System.out.println("Value of q"+q);
	
	}
	return result;
	}
}
