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

	
	
}
