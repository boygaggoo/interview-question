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
	

}	