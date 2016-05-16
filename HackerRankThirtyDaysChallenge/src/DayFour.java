import java.util.Scanner;

/***
 *  Objective 
In this challenge, we're getting started with conditional statements. Check out the Tutorial tab for learning materials and an instructional video!
Task 
Given an integer, , perform the following conditional actions:

If  is odd, print 
If  is even and in the inclusive range of  to , print 
If  is even and in the inclusive range of  to , print 
If  is even and greater than , print 
Complete the stub code provided in your editor to print whether or not  is weird.
 */
public class DayFour {
	 public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt(); 
	      scan.close();
	      String ans="";
	          
	      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
	      if(n%2==1){
	         ans = "Weird";
	      }
	      else if((n%2==0)&&(n>=2&&n<=5)){
	        ans="Not Weird";
	      }
	      else if((n%2==0)&&(n>=6&&n<=20)){
	    	  ans = "Weird";
	      }
	      else{
	    	  ans="Not Weird";
	      }
	      System.out.println(ans);
	   }
}
