package chap3;

public class Stack {
	Node top;
	private int size=0;

	public void push(Object data) {
		Node nw=new Node(data);
		nw.next=top;
		top=nw;
		size++;
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public Object pop() {
		// TODO Auto-generated method stub
		if(top!=null){
			Object data=top.data;
			top=top.next;
			return data;
		}
		return null;
	} 

	public Object peek() {
		// TODO Auto-generated method stub
		return top.data;
	}
}