package hackerrank.challenge.crackingthecoding;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets {
    public static boolean isBalanced(String expression) {
    	Stack<Character> stack=new Stack<>();
    	for(Character c:expression.toCharArray()){
    		if(c=='('){
    			stack.push(c);
    		}
    		else if(c==')'){
    			if(stack.isEmpty()){
    				return false;
    			}
    			if(stack.peek()=='('){
    				stack.pop();
    			}
    		}
    		if(c=='{'){
    			stack.push(c);
    		}
    		else if(c=='}'){
    			if(stack.isEmpty()){
    				return false;
    			}
    			if(stack.peek()=='{'){
    				stack.pop();
    			}
    		}
    		if(c=='['){
    			stack.push(c);
    		}
    		else if(c==']'){
    			if(stack.isEmpty()){
    				return false;
    			}
    			if(stack.peek()=='['){
    				stack.pop();
    			}
    		}
    	}
      
    	return stack.isEmpty();
     }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}