package random;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class ParanthesisTest {

	@Test
	public void test() {
//		Scanner in=new Scanner(System.in);
//		String str=in.nextLine();
		
		System.out.println(Paranthesis.isParenthesisMatch("{}(){}<>[]"));
		System.out.println(Paranthesis.isParenthesisMatch("<()[]{}>"));
	}

}
