package datastructures;

import java.util.HashSet;

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


	public Object removeFirst() {
		
		if(size<=1){
			Object data=head.data;
			head=head.next;
			size--;
			return data;
		}
		else{
			Object data=head.data;
			
			head=head.next;
//			curr=null;
			
			size--;
			
			return data;
		}
		
	}


	public Object removeAt(int index) {
		// TODO Auto-generated method stub
		Node curr=head;
		int counter=0;
		Node temp=curr.next;
		if(index==0){
			Object data=curr.data;
			head=head.next;
			size--;
			return data;
		}
			while(curr!=null){
				if(counter==index-1){
					
					break;
				}
				curr=curr.next;
				temp=temp.next;
				counter++;
			}
            Object data=curr.next.data;
			curr.next=curr.next.next;
			size--;
			return data;
		
		
	}

/**
 * This is a question from cracking the coding book
 * compexity O(n)
 */
	public void removeAllDuplicates() {
	    Node n=head;
	    Node prev=null;
	    HashSet hs=new HashSet<>();
	    while(n!=null){
	    	if(hs.contains(n.data)){
	    		prev.next=n.next;
	    	}
	    	else{
	    		hs.add(n.data);
	    		prev=n;
	    	}
	    	n=n.next;
	    }
		
	}
/**
 * Follow up question for above. This does not use additional storage
 * complexity is O(n^2)
 */

public void removeAllDuplicates2() {
	// TODO Auto-generated method stub
	
	Node curr=head;
	
	while(curr!=null){
		Node n=curr;
		while(n.next!=null){
			if(n.next.data.equals(curr.data)){
				n.next=n.next.next;
			}else{
			n=n.next;
			
			}
			
		}
		curr=curr.next;
	}
	
}
    
}
