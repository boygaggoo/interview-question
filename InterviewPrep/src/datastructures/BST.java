package datastructures;

public class BST {
	BSTNode root;

	public BST(Object data) {
		root=new BSTNode(data);
	}
	public void insert(Object data) {
		insert(root,data);
		
	}
	private BSTNode insert(BSTNode root,Object data){
		BSTNode node=new BSTNode(data);
		if(root==null){
			root=node;
		}
		else if((int)data<=(int)root.data){
		    root.left= insert(root.left,data);
		}
		else if((int)data>(int)root.data){
			root.right=insert(root.right, data);
		}
		//System.out.println(root.data);
		return root;
	}
	public boolean search(Object data) {
	return search(root, data);
		
	}
	private boolean search(BSTNode root,Object data){
		if(root==null){
			return false;
		}
		else if(root.data==data){
			return true;
		}
		else if((int)data<=(int)root.data){
			return  search(root.left,data);
		}
		else {
			return  search(root.right,data);
		}
		
		
	}
	public void print() {
	
		printBinaryTree(root, 0);
	  
		
	}
	
	public static void printBinaryTree(BSTNode root, int level){
	    if(root==null)
	         return;
	    printBinaryTree(root.right, level+1);
	    if(level!=0){
	        for(int i=0;i<level-1;i++)
	            System.out.print("|\t");
	            System.out.println("|-------"+root.data);
	    }
	    else
	        System.out.println(root.data);
	    printBinaryTree(root.left, level+1);
	}
	public Object min() {
		BSTNode temp=root;
		if(temp==null){
			return -1;
		}
		while(temp.left!=null){
			temp=temp.left;
		}
		return temp.data;
		
	}
	public Object max() {
	BSTNode temp=root;
	if(temp==null){
		return -1;
	}
	while(temp.right!=null){
		temp=temp.right;
	}
		return temp.data;
	}    

	
	
}
