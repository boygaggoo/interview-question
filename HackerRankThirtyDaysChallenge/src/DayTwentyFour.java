import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class DayTwentyFour {
	static void levelOrder(Node root){
	     if(root==null)return;
	     Queue<Node>  q=new LinkedList<Node>();
	     Node temp=root;
	     q.add(temp);
	     while(!q.isEmpty()){
	    	 Node n=q.poll();
	    	 System.out.print(n.data+" ");
	    	 if(n.left!=null)
	    		 q.add(n.left);
	    		 if(n.right!=null)
	    		 q.add(n.right);
	     }
	      
	    }
	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	  public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          int T=sc.nextInt();
          Node root=null;
          while(T-->0){
              int data=sc.nextInt();
              root=insert(root,data);
          }
          levelOrder(root);
      }	
}
