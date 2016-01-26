package chap3;

public class Queue {
	Node first,last;
	int size=0;
	public void add(int elem) {
		Node nw=new Node(elem);
		if(first==null){
			last=nw;
			first=last;
			size++;
		}
		else{
			last.next=nw;
			last=last.next;
			size++;
		}
	}
	public int size(){
		return size;
	}
	public Object remove() {
	
		if(first!=null){
			Object data=first.data;
		    first=first.next;
		    size--;
			return data;
		}
		return null;
		
	}
	
	

}
