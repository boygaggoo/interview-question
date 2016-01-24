package chap3;

import static org.junit.Assert.*;

import javax.xml.ws.ServiceMode;

import org.junit.Test;
  
public class StackTest {
    Stack s;
	

	@Test
	public void pushTest() {
		s=new Stack();
        s.push(1);	
        s.push(2);
        assertEquals(2, s.size());
	}
	@Test
	public void popTest() {
		s=new Stack();
        s.push(1);	
        s.push(2);
        assertEquals(2, s.pop());
        assertEquals(1, s.pop());
        assertEquals(null, s.pop());
        
	}
	@Test
	public void peekTest() {
		s=new Stack();
        s.push(1);	
        s.push(2);
        assertEquals(2, s.peek());
        assertEquals(2, s.pop());
        assertEquals(1, s.peek());
        
	}
	@Test
	public void javaStacktest(){
		java.util.Stack s=new java.util.Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
//		System.out.println(s.search(1));
	}
	@Test
	public void searchTest(){
		s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		assertEquals(3, s.search(1));
	}
	@Test
	public void isEmptyTest(){
		s=new Stack();
		assertEquals(true, s.empty());
		s.push(1);
		assertEquals(false, s.empty());
	}
	@Test
	public void minTest(){
		s=new Stack();
		s.push(3);
		s.push(2);
		
//		assertEquals(s.getMin(), 1);
//		s.pop();
		assertEquals(2, s.getMin());
		s.push(1);
		assertEquals(1, s.getMin());
		s.pop();
		assertEquals(2, s.getMin());
	}
	@Test
	public void paranthesisTest(){
	  assertEquals(true, Paranthesis.verify("()[]"));
	  assertEquals(true, Paranthesis.verify("[([()])]"));
	}

}	