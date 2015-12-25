package chap2;

/**
 * Singly LinkedList implementation
 * @author Siddiq Ahmed Syed
 *
 */

public class LinkedList {
	Node first;
	int size;
	public LinkedList() {
		first=null;
		size=0;
	}

	
	public void add(Object word) {
		Node newEntry=new Node(word);
		if(first==null){
		first=newEntry;
		first.next=null;
		size++;
	}
		else{
			first.next=newEntry;
			size++;
		}
	}

	public boolean contains(Object word) {
	     Node pointer=first;
	     while(pointer!=null){
	    	 if(pointer.data.equals(word)){
	    		 return true;
	    	 }
	    	 pointer=pointer.next;
	     }
	     return false;
		
	}


	public Object get(int i) {
		Object elem = null;
		Node pointer=first;
		int count=0;
	     while(pointer!=null){
	    	 if(count==i){
	    		 elem=pointer.data;
	    		 return elem;
	    	 }
	    	 
	    	 pointer=pointer.next;
	    	 count++;
	     }
	     
		return elem;
	}


	public int size() {
		// TODO Auto-generated method stub
		return size;
	}


	public Object remove(Object word) {
		Object remElem=null;
		Node pointer=first;
		while(pointer!=null){
			if(pointer.data.equals(word)){
				remElem=pointer.data;
				pointer.next=null;
				pointer=pointer.next;
				size--;
				return remElem;
			}
			pointer=pointer.next;
		}
		return remElem;
	}
	
}
class Node{
	public Object data;
	public Node next;
	Node(Object data){
		this.data=data;
		next=null;
	}
}
