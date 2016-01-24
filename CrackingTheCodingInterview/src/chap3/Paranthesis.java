package chap3;

import java.util.Stack;

public class Paranthesis {

	public static boolean verify(String input) {
		java.util.Stack<Character> stack=new Stack<>();
		char [] inpArr=input.toCharArray();
		for (int i=0;i<inpArr.length;i++){
			if(inpArr[i]==(char)'('){
				stack.push(inpArr[i]);
			}
			if(inpArr[i]=='['){
				stack.push(inpArr[i]);
			}
			else if(inpArr[i]==')'){
				if( stack.peek()=='(' ){
					stack.pop();
				}
			}
			else if(inpArr[i]==']'){
				if( stack.peek()=='[' ){
					stack.pop();
				}
			}
			
		}
		return stack.empty();
		
		
	}
	

}
