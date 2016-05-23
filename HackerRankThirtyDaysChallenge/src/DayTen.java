import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayTen {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    System.out.println(factorial(num));
    }

	private static int factorial(int num) {
		if(num==0){
			return 1;
		}
		return num*factorial(num-1);
	}
}