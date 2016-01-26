package chap3;

import java.util.Stack;

public class MyQueue3_5 {
	Stack newStack,OldStack;
	public MyQueue3_5() {
		newStack=new Stack<>();
		OldStack=new Stack<>();
	}
	public void push(Object elem){
		newStack.add(elem);
	}
	public Object pop(){
		stackShift();
		return OldStack.pop();
	}
	public void stackShift(){
		if(OldStack.isEmpty()){
			while(!newStack.isEmpty()){
				OldStack.push(newStack.pop());
			}
		}
	}
	public Object peek(){
		stackShift();
		return OldStack.peek();
	}

}
