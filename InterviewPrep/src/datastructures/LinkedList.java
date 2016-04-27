package datastructures;

import java.util.HashSet;
import java.util.Stack;

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
		if(index==0){
			newNode.next=head;
			head=newNode;
			
		}
		else{
		for(int i=0;i<index-1;i++){
			curr=curr.next;
		}
		newNode.next=curr.next;
		curr.next=newNode;
		}
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

/**
 * Another question from chapter 2 of Cracking the code
 * This method will return the last elem based on the input.
 * This is the naive approach
 * @param index
 * @return
 */
public Object kToLastElem(int index) {
	Node curr=head;
	int count=1;
	int target=size-index;
	while(curr!=null){
		if(count==target){
			break;
			
		}
		count++;
		curr=curr.next;
	}
	return curr.data;
}


/**
 * Another question from chapter 2 of Cracking the code
 * This method will return the last elem based on the input.
 * This is the recursive approach
 * @param index
 * @return
 */
public Object kToLastRecElem(int i) {
	return getRecursive(head,i);
}

/**
 * helper method for the previous method
 * @param head
 * @param i
 * @return
 */
private int getRecursive(Node head, int i) {
	if(head == null){
		return 0;
	}
	int j=getRecursive(head.next, i)+1;
	if(j==i){
		System.out.println(head.data);
	}
	return j;
}
/**
 * This the solution to the cracking the coding interview question Chapter 2
 * Finding k to last elem without using the size method
 * @param index
 * @return
 */

public Object kToLastIterElem(int index) {
	
	Node p1=head;
	Node p2=head;
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


public Node getNode(int index) {
	// TODO Auto-generated method stub
	Node curr=head;
	for(int i=1;i<index;i++){
		curr=curr.next;
	}
	if(curr==null)return null;
	return curr;
}


public boolean deleteNode(Node n) {
	// TODO Auto-generated method stub
	if(n==null){
		return false;
	}
	Node temp=n.next;
	temp.data=n.data;
	temp.next=n.next;
	
	return true;
}
/**
 * This is the question from cracking the code and this method
 * arranges the nodes based the given pKey.
 * All the nodes less than or equal to comes before pKeys and viceversa
 * @param i
 * @return 
 */

public Node partition(int pKey) {
	// TODO Auto-generated method stub
	Node curr=head;
	Node before=null;
	Node after=null;
	while(curr!=null){
		Node next=curr.next;
		if((int)curr.data<=pKey){
			curr.next=before;
			before=curr;
		}
		else{
			curr.next=after;
			after=curr;
		}
		curr=next;
	}
	if(before==null){return after;}
	Node head=before;
	while(before.next!=null){
		before=before.next;
	}
	before.next=after;
	return head;
}
/**
 * This is one of the question from cracking the coding.
 * It checks if the list is palindrome eg 1->0->0->1 is palindrome
 * 
 * @return true|false
 */

public boolean isPalindrome() {
	Stack s=new Stack<>();
	Node curr=head;
	for(int i=0;i<size()/2;i++){
		s.push(curr.data);
		curr=curr.next;
	}
	while(curr!=null){
		if(curr.data!=s.pop()){
			return false;
		}
		curr=curr.next;
	}
	return true;
}
/**
 * This is the question on the leet code.
 * @param i
 * @return
 */

public Object removeKLast(int index) {
	Node p1=head;
	Node p2=head;
	for (int i=0;i<index;i++){
		p1=p1.next;
		
	}
	while(p1.next!=null){
		p1=p1.next;
		p2=p2.next;
	}
	System.out.println("p1:"+p2.data+" p2:"+p2.next.data);
	Object data=p2.next.data;
	p2.next=p2.next.next;
	
	return data;
}
/**
 * This is my implementation of partitioning nodes 
 * @param pKey
 * @return 
 */

public Node partition2(int pKey) {
	Node before=null,after=null,partition=null;
	Node curr=head;
	
	while(curr!=null){
		if((int)curr.data<pKey){
			if(before==null){
				before=curr;
			}
			else{
				before.next=curr;
			}
			//before=before.next;
		}
		else if ((int)curr.data>pKey){
			if(after==null){
				after=curr;
			}
			else{
				after.next=curr;
			}
			//after=after.next;
		}
		else{
			partition=curr;
		}
			curr=curr.next;
		}
		before.next=partition;
		after.next=null;
	   partition.next=after;
	  
	   return before;
	
}


public void addFirst(Object data) {
	Node first=new Node(data);
	if(head==null){
		head=first;
	}else{
		first.next=head;
		head=first;
	} 
	 
}


public Node reverse() {
	return reverse(head);
	
}
/**
 * Interview question to reverse the LinkedList with no additional data structure
 * Approach: 1->2->3->4   (2->3->4)->1
 * Ref:https://www.youtube.com/watch?v=LgapVjJYxqc
 * @param head
 * @return
 */

private Node reverse(Node head) {
	// TODO Auto-generated method stub
	if(head==null||head.next==null){
		return head;
	}
	Node remainNodes=reverse(head.next);
	Node curr=remainNodes;
	while(curr.next!=null){
		curr=curr.next;
	}
	curr.next=head;
	head.next=null;
	return remainNodes;
}
public Node reverse2(){
	Node temp1=head;
	Node temp2=head.next;
	Node temp5; 
	while(temp2!=null){
		temp5=temp2.next;
		if (temp5==null)
			break;
		temp2.next=temp1 ;
		temp2=temp5;
		temp1=temp1.next;
		
	}
	temp2.next=temp1;
/*	temp1.next=null;
    temp2.next=temp1;*/
	return temp2;
}
/**
 * This is the iterative solution for reversing 
 * @return
 */
public Node reverse3(){
	Node p=head,q=head,ref;
	int count=1;
	while(q.next!=null){
		count++;
	    q=q.next;
	}
	for(int i=1;i<count-1;i++){
		p=p.next;
	}
	int refCount=count;
	ref=q;
	while(refCount>1){
	
		q.next=p;
		p.next=null;
		q=q.next;
		count--;
		 p=head;
	    for(int i=1;i<count-1;i++){
			p=p.next;
		}
		refCount--;
	}
	return ref;
	
}


public void printReverse() {
      printReverse(head);
	
}


private void printReverse(Node curr) {
	if(curr==null)
		return;
	printReverse(curr.next);
	System.out.print(curr.data+" ");
	
}


public void findMiddle() {
	Node cur=head;
	Node mid=head;
	int len=0;
	while(cur.next!=null){
		len++;
		if(len%2==0){
			mid=mid.next;
		}
		cur=cur.next;
		
	}
	System.out.println(mid.data);
}


public void insertSorted(int i) {
	Node n=new Node(i);
	if(head==null||(int)head.data>=(int)n.data){
		n.next=head;
		head=n;
	}else{
		Node curr=head;
		Node forward=head.next;
		while(forward!=null &&(int)forward.data<(int)n.data){
			forward=forward.next;
			curr=curr.next;
		}
		curr.next=n;
		n.next=forward;
	}
	
}


public Node getList() {
	// TODO Auto-generated method stub
	return head;
}


public Object getKLastNode(int pos) {
	Node slowRunner=head;
	Node fastRunner=head;
	int i=0;
	while(i<pos){
		fastRunner=fastRunner.next;
		i++;
	}
	while(fastRunner!=null){
		fastRunner=fastRunner.next;
		slowRunner=slowRunner.next;
	}
	return slowRunner.data;
}


public void printReverse2() {
	printReverse2(head);
	
}


private void printReverse2(Node head) {
    if(head.next==null){
    	System.out.println(head.data); 
    	return;
    	 }
    printReverse(head.next);
	
}

}
