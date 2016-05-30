import java.util.Scanner;


public class DaySixteen {
	class Node{
		int data;
		Node next;
		Node(int d){
	        data=d;
	        next=null;
	    }
		
	
	public  Node insert(Node head,int data)
	{
		  Node n = new Node(data);
		     Node  temp = head;
		     if (head == null)
		       return n;
		   else 
		    while(temp.next!=null){
		        temp = temp.next ;
		    }

		 temp.next = n;
		 return head;  
}
	  public void display(Node head)
	    {
	          Node start=head;
	          while(start!=null)
	          {
	              System.out.print(start.data+" ");
	              start=start.next;
	          }
	    }
	}
	    public static void main(String args[])
	    {
	    	
	     /*     Scanner sc=new Scanner(System.in);
	          Node head=null;
	          int T=sc.nextInt();
	          while(T-->0){
	              int ele=sc.nextInt();
	              head=Node.insert(head,ele);
	          }
	          display(head);*/

	   }
}
