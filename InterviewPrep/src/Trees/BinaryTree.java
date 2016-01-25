package Trees;

public class BinaryTree {
	Node root;

	
	public BinaryTree(Object data) {
		root=new Node();
		root.data=data;
	}


	public BinaryTree(Object data, BinaryTree left, BinaryTree right) {
		root=new Node();
		root.data=data;
		root.left=left.root;
		root.right=right.root;
	}

	  private static int height(Node n)
	   {
	          if (n == null) { return 0; }
	         else { return 1 + Math.max(height(n.left), height(n.right)); }
	   }
	public double getHeight() {
		return height(root);
	}


	public void addLSubtree(BinaryTree left) {
		root.left=left.root;
	}

	public void addRSubtree(BinaryTree right) {
		
	root.right=right.root;
}


	public void inorder() {
		// TODO Auto-generated method stub
		inorder(root);

	}


	private void inorder(Node root2) {
		if(root2==null){return;}
	System.out.println(root.data);
	inorder(root2.left);
	inorder(root2.right);
		
	}}
