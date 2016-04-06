package String;

import java.util.Stack;

public class ValidParenthesis {
	public static void main(String[] args) {
		System.out.println(valid("({})"));
		System.out.println(valid("([)]"));
	}

	private static boolean valid(String str) {
		Stack s=new Stack<String>();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='('){
				s.push('(');
			}
			else if(str.charAt(i)=='['){
				s.push('[');
			}
			else if(str.charAt(i)=='{'){
				s.push('{');
			}
			else if(str.charAt(i)==')'){
				if((char)s.peek()=='('){
					s.pop();
				}else{
					return false;
				}
			}
			else if(str.charAt(i)==']'){
				if((char)s.peek()=='['){
					s.pop();
				}else{
					return false;
				}
			}
			else if(str.charAt(i)=='}'){
				if((char)s.peek()=='{'){
					s.pop();
				}else{
					return false;
				}
			}else{
				return false;
			}
		}
		return s.empty();
	}

}
