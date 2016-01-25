package Trees;

public class BinarySearchTree {
   Node root;
   
   public BinarySearchTree(){
	   root=null;
   }
   public void insert(int data){
	   root=insert(root,data);
   }
private Node insert(Node root,int data) {
	if(root==null){
		root=new Node(data);
	}
	else if(data<=(int)root.data){
		root.left=insert(root.left,data);
		
	}
	else{
		root.right=insert(root.right,data);
	}
	return root;
}
}
