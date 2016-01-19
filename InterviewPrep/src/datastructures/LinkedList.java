package datastructures;

public class LinkedList {
     
	Node head;
	int size=0;
	
	public void add(Object data) {
		// TODO Auto-generated method stub
		Node newNode=new Node(data);
	
		if(head==null){
			head=newNode;
			newNode.next=null;
			size++;
		}
		else{
		    newNode.next=head;
		    head=newNode;
			size++;
		}

		}
	

	public void print() {
		Node curr=head;
		while(curr!=null){
			System.out.println(curr.data);
			curr=curr.next;
		}
		
	}
	public int size(){
		return size;
	}


	public void insertAfter(Object prev, Object data) {
		// TODO Auto-generated method stub
		Node newNode=new Node(data);
		Node curr=head;
		while(curr!=null){
			if(curr.data.equals(prev))
			  return;
			curr=curr.next;
		}
		newNode.next=curr;
		curr=newNode;
		
	}
    
}
