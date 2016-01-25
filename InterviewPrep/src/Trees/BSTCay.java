package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BSTCay {
	
	Node root;
	
	public void addNode(Comparable data){
		Node nw=new Node();
		nw.data=data;
		nw.left=null;
		nw.right=null;
		if(root==null){root=nw;}
		else{root.addNode(nw);}
	}
	

	
	
	
	
	
	
	
	
	
	
    
	class Node{
		
		Comparable data;
		Node left;
		Node right;
		
		public void addNode(Node nw) {
			int comp=nw.data.compareTo(data);
			if(comp<0){
				if(left==null){left=nw;}
				else{left.addNode(nw);}
			}
			else if(comp>0){
				if(right==null){right=nw;}
				else{right.addNode(nw);}
			}
			
			
		}
	}













	public boolean lookup(Comparable data) {
		return lookup(root, data);
		
	}













	private boolean lookup(Node n, Comparable data) {
		// TODO Auto-generated method stub
		int temp=data.compareTo(n.data);
		 if (n==null) { 
		      return(false); 
		    }
		if(temp==0){
			return true;
		}
		else if(temp<0){
			return lookup(n.left, data);
		}
		else if(temp>0){
			return lookup(n.right, data);
		}
		return false;
		
	}

public void printInorder() {
		printInoder(root);
		
	}
private void printInoder(Node n) {
		if(n==null) return;
		printInoder(n.left);
		System.out.println(n.data);
		printInoder(n.right);
		
	}
public void printPreorder() {
	System.out.println("Preorder");
		printPreorder(root);
		
	}
public void printPostorder() {
	System.out.println("Postorder");
	printPostOrder(root);
	
}



	private void printPostOrder(Node n) {
	if(n==null)return;
	printInoder(n.right);
	printInoder(n.left);
	System.out.println(n.data);
	
}
	public void mirror() { 
		  mirror(root); 
		}

		private void mirror(Node node) { 
		  if (node != null) { 
		    // do the sub-trees 
		    mirror(node.left); 
		    mirror(node.right);

		    // swap the left/right pointers 
		    Node temp = node.left; 
		    node.left = node.right; 
		    node.right = temp; 
		  } 
		} 

	private void printPreorder(Node root) {
		if(root==null)return;
		System.out.println(root.data);
		printPreorder(root.left);
		printPreorder(root.right);
	}





	public void levelOrder() {
		levelOrder(root);
		
	}



	private void levelOrder(Node root) {
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			Node temp=q.poll();
			System.out.println(temp.data);
			if(temp.left!=null){q.add(temp.left);}
			if(temp.right!=null){q.add(temp.right);}
		}
		
	}




}
