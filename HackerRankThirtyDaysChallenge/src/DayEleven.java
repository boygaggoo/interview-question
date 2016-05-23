import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/***
 * Given a base-10 integer,n , convert it to binary (base-2). Then find and
 *  print the base- integer denoting the maximum number of consecutive 1's in n's binary representation.
 * @author Siddiq Ahmed Syed
 *
 */
public class DayEleven {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s=Integer.toBinaryString(n);
        System.out.println(s);
//        System.out.println(s);
        int consecutivesOne=getCosecutivesOnes(convertToBinary(n));
        System.out.println(consecutivesOne);
        
        
    }

	private static int getCosecutivesOnes(String convertToBinary) {
		int result=0;
		int max=0;
		for(int j=0;j<convertToBinary.length();j++){
			int i=Integer.parseInt(convertToBinary.charAt(j)+"");
			if(j==convertToBinary.length()-1&&i==0){
				return result;
			}
			if(i!=1){
				if(max<result){
					max=result;
				}
				result=0;
			}else{
			result++;
			}
	
		}
		if(max<result){
			max=result;
		}
		return max;
	}

	private static String convertToBinary(int n) {
//		List<Integer> result=new LinkedList();
		StringBuilder sb=new StringBuilder();
	
		Stack<Integer> result=new Stack<Integer>();
//		String result="";
		while(n>0){
			int remainder=n%2;
			n=n/2;
			sb.append(remainder);
		}
		return sb.reverse().toString();
	}
}
