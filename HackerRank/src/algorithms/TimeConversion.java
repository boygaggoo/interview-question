package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class TimeConversion {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String time = in.next();
	        String [] arr=time.split(":");
	       
	        if(arr[0].equals("12")&&arr[2].contains("AM")){
	        	arr[0]="00";
	        }
	        else if(!arr[0].equals("12")&&arr[2].contains("PM")){
	        	arr[0]=""+(12+Integer.parseInt(arr[0]));
	        }
	        System.out.println(arr[0]+":"+arr[1]+":"+arr[2].substring(0,2));
	    }
}
