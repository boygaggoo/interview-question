package Recursion;

public class Power {
public static void main(String[] args) {
	System.out.println(powerOfNumber(2,4));
}

private static int powerOfNumber(int x, int n) {
	int result=1; 
	while(n>0){
		 result*=x;
		 n--;
	 }
	return result;
}
}
