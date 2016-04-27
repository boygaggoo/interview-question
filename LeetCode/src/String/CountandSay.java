package String;

import java.util.HashMap;

/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
 * @author Siddiq Ahmed Syed
 *
 */
public class CountandSay {
	public static void main(String[] args) {
		System.out.println(countAndSay(3));
	}

	public static String countAndSay(int n) {
	    if(n<=0)
	        return "";
	    String curRes = " 1";
	    int start = 1;
	    while(start < n){
	        StringBuilder res = new StringBuilder();
	        int count = 1;
	        for(int j=1;j<curRes.length();j++){
	            if(curRes.charAt(j)==curRes.charAt(j-1))
	                count++;
	            else{
	                res.append(count);
	                res.append(curRes.charAt(j-1));
	                count = 1;
	            }
	        }
	        res.append(count);
	        res.append(curRes.charAt(curRes.length()-1));
	        curRes = res.toString();
	        start++;
	    }
	    return curRes;
	}


}
