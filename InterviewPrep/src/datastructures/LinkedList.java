package datastructures;

public class LinkedList {
     
	Node head;
	Node tail;
	private int size=0;
	
	public void add(Object data) {
		// TODO Auto-generated method stub
		Node newNode=new Node(data);
	
		if(head==null){
			head=newNode;
			tail=newNode;
			
			size++;
		}
		else{
			Node pointer=head;
			while(pointer.next!=null){
				pointer=pointer.next;
			}
			pointer.next=newNode;
			
            size++;
		}

		}
	

	public void print() {
		Node curr=head;
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
		
	}
	public int size(){
		return size;
	}


	public void insertAfter(Object prev, Object data) {
		// TODO Auto-generated method stub
		Node newNode=new Node(data);
		Node curr=head;
		while(curr!=null){
			if(curr.data.equals(prev)){
		       break;
			}
			curr=curr.next;
		}
		
		newNode.next=curr.next;
		curr.next=newNode;
		size++;
		
	}


	public void addAt(int index, Object data) {
		Node newNode=new Node(data);
		Node curr=head;
		int count=0;
		if(index>size||index<0){
		    throw new IndexOutOfBoundsException("Size of LinkedList is:"+size());
		}
		while(curr!=null){
			if(count==index){
				break;
			}
			curr=curr.next;
			count++;
			
		}
		newNode.next=curr.next;
		curr.next=newNode;
		size++;
		
		
	}


	public boolean contains(Object data) {
		// TODO Auto-generated method stub
		Node curr=head;
		while(curr!=null){
			if(curr.data.equals(data)){
				return true;
			}
			curr=curr.next;
		}
		return false;
	}


	public Object getFirst() {
		// TODO Auto-generated method stub
		Node curr=head;
		if(curr!=null){
			return curr.data;
		}
		return null;
	}


	public Object get(int index) {
		// TODO Auto-generated method stub
		int count=0;
		Node curr=head;
		if(index>size()||index<0){
			throw new IndexOutOfBoundsException();
		}
		
		while(curr!=null){
			if(count==index){
				break;
			}
			curr=curr.next;
			count++;
			
		}
		return curr.data;
	}


	public LinkedList removeDuplicates() {
		Node curr=head;
	
		Node temp = null;
		LinkedList ll=new LinkedList();
		if(curr!=null && curr.next!=null){
			temp=curr.next;
		}
	
		while(curr!=null&&temp!=null){
			if(!(curr.data.equals(temp.data))){
				ll.add(curr.data);
				
			}
			curr=curr.next;
			temp=temp.next;
		}
		ll.add(curr.data);
		return ll;
	}
    
}
