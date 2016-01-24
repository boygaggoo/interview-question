package chap3;



public class Stack {
	Node top;
	private int size=0;
	private int min=Integer.MAX_VALUE; 


	public void push(Object data) {
		Node nw=new Node(data);
		if((int)nw.data<min){min=(int)nw.data;}
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
			if(min==(int)data){min=Integer.MAX_VALUE;findNextMin();};
			return data;
		}
		return null;
	} 

	private void findNextMin() {
		Node curr=top;
		while(curr!=null){
			if((int)top.data<min){
				min=(int)top.data;
			}
			curr=curr.next;
		}
		
	}
	public int getMin(){
		return min;
	}

	public Object peek() {
		// TODO Auto-generated method stub
		return top.data;
	}

	public int search(int k) {
		Node p=top;
		int pos=1;
		while(p!=null){
			if((int)p.data==k){
				break;
			}
			pos++;
			p=p.next;
		}
		return pos;
	}

	public boolean empty() {
		// TODO Auto-generated method stub
		return top==null;
	}
}