package String;

import java.util.Stack;
/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 *  determine if the input string is valid.
 *  The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * @author Siddiq Ahmed Syed
 *
 */
public class ValidParenthesis {
	public static void main(String[] args) {
		System.out.println(valid("({})"));
		System.out.println(valid("([)]"));
		System.out.println(efficientSol("({})"));
	}
	private static boolean efficientSol(String str) {
		str=str.replace("(", "");
		str=str.replace("{", "");
		str=str.replace("}", "");
		str=str.replace(")", "");
	    return str.length()<=1;
	}
	/**
	 * Time Complexity: O(n)
	 * Space Complexity: O(n) 
	 * @param str
	 * @return
	 */
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
