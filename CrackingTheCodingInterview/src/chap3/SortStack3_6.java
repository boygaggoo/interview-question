package chap3;

import java.util.Stack;

public class SortStack3_6 {
	
  static	Stack s1,s2;
	public SortStack3_6() {
		s1=new Stack<Integer>();
		
	}
public static void main(String[] args) {
	SortStack3_6 s=new SortStack3_6();
	s.push(1);
	s.push(2);
	s.push(5);
	s.push(3);
	s.push(10);
	s.sort();
	System.out.println(pop());
	System.out.println(pop());
	
	
}

private void sort() {
	// TODO Auto-generated method stub
	s2=new Stack<>();
	while(!s1.isEmpty()){
		int temp=(int)s1.pop();
		while(!s2.isEmpty()&&temp<(int)s2.peek()){
			s1.push(s2.pop());
		}
		s2.push(temp);
	}
	
}
private static Object pop() {
	// TODO Auto-generated method stub
	return s2.pop();
}
private static void push(int i) {
	// TODO Auto-generated method stub
     s1.push(i);
}
}
