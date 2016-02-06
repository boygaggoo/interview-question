package chap2;

import java.util.HashSet;
import java.util.Set;



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

	
	public boolean add(Object word) {
		Node newEntry=new Node(word);
		Node pointer=first;
		if(first==null){
		first=newEntry;
		first.next=null;
		size++;
		return true;
	}
		while(pointer.next!=null){
			pointer=pointer.next;
		}
		pointer.next=newEntry;
			size++;
			return true;
		
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
		if(pointer.data.equals(word)){
			remElem=pointer.data;
			first=first.next;
			size--;
			return remElem;

	
		}
		while(pointer.next!=null){
			if(pointer.next.data.equals(word)){
				remElem=pointer.next.data;
				pointer=pointer.next;
				
				
				size--;
				return remElem;
			}
			pointer=pointer.next;
		}
		return remElem;
	}

/**
 * Question from chapter 2 of Cracking the coding interview
 */
	public void removeDuplicates() {
		HashSet table = new HashSet();
		Node pointer=first;
		Node prev=null;
		while(pointer!=null){
			if(table.contains(pointer.data)){
				prev.next=pointer.next;
				size--;
			}else{
				table.add(pointer.data);
				prev=pointer;
			
			}
			pointer=pointer.next;
		
		}
		
	}


public void print() {
	Node pointer=first;
	while(pointer!=null){
		System.out.println(pointer.data);
		pointer=pointer.next;
	}
	
}


public Object getKLast(int i) {
	// TODO Auto-generated method stub
	int count=size;
	Node pointer=first;
	while(pointer!=null){
		if(count==i){
			return pointer.data;
		}
		pointer=pointer.next;
		count--;
	}
	return null;
}


public Object recursivegetKLast(int index) {
	
		
		Node p1=first;
		Node p2=first;
		for(int i=0;i<index-1;i++){
			p2=p2.next;
		}
		if(p2==null)return null;
		while(p2.next!=null){
			p1=p1.next;
			p2=p2.next;
		}
		return p1.data;
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
