package datastructures;

public class BinaryTree {
	NodeBT root;
	
	public void insert(Object data){
		if(root==null){
			root=new NodeBT(data);
		}else{
		insert(root,data);
		}
	}

	private NodeBT insert(NodeBT root, Object data) {
	NodeBT node=new NodeBT(data);
	if(root==null){
		root=node;
	}else if((int)data<(int)root.data){
		root.left=insert(root.left, data);
	}else if((int)data>(int)root.data){
		root.right=insert(root.right, data);
	}
		return root;
	}



	public void print() {
		print(root);
	
		
	}

	private void print(NodeBT root) {
	if(root!=null){
			
			System.out.println(root.data);
		}
	if(root.left!=null){
	print(root.left);
	}
	if(root.right!=null){
	print(root.right);
	}
		
	}

	public boolean lookup(int data) {
	
		return lookup(root,data);
	}

	private boolean lookup(NodeBT root, int data) {
		if((int)root.data==data){
			return true;
		}else if(data<(int)root.data){
			return lookup(root.left,data);
		}
		else if(data>(int)root.data){
			return lookup(root.right,data);
		}
		return false;
		
	}

	public int depth() {
		return depth(root);
		
	}
	
	private int depth(NodeBT root) {
		// TODO Auto-generated method stub
		if(root==null){
		return 0;
		}
		else{
			int lDepth=depth(root.left);
			int rDepth=depth(root.right);
			return Math.max(lDepth, lDepth)+1;
		}
	}

	public int size() {
		return size(root);
		
	}
	/** 
	 Returns the number of nodes in the tree. 
	 Uses a recursive helper that recurs 
	 down the tree and counts the nodes. 
	*/ 
	private int size(NodeBT root) {
		// TODO Auto-generated method stub
		if(root==null)
		return 0;
		else{
			return (size(root.left))+1+size(root.right);
		}
	}

	public int minValue() {
		
		return minValue(root);
	}
	
	public int maxValue() {
		
		return maxValue(root);
	}

	private int minValue(NodeBT root) {
		// TODO Auto-generated method stub
		while(root.left!=null){
			root=root.left;
		}
		return (int)root.data;
	}
	
	private int maxValue(NodeBT root) {
		
		while(root.right!=null){
			root=root.right;
		}
		return (int)root.data;
	}

	public void print(String order) {
		if(order.equals("inorder")){
			printInorder(root);
		}else if(order.equals("postorder")){
			printPostOrder(root);
		}else if(order.equals("preorder")){
			printPreOrder(root);
		}
		
	}

	private void printPreOrder(NodeBT root) {
		if(root==null){
			return;
		}
		System.out.print(root.data+" ");
		printPreOrder(root.left);
		printPreOrder(root.right);
		
	}

	private void printPostOrder(NodeBT root) {
		if(root==null){
			return;
		}
		print(root.left);
		print(root.right);
		System.out.print(root.data+" ");
		
	}

	private void printInorder(NodeBT root) {
		if(root==null){
			return;
		}
		printInorder(root.left);
		System.out.print(root.data+" ");
		printInorder(root.right);
	
	}

	public boolean hasPathSum(int sum) {
		// TODO Auto-generated method stub
		return hasPathSum(root,sum);
	}

	private boolean hasPathSum(NodeBT root, int sum) {
		if(root==null){
			System.out.println(sum);
			return sum==0;
		}
		int subSum=sum-(int)root.data;
		
		return hasPathSum(root.left,subSum)||hasPathSum(root.right,subSum);
	}
	/** 
	 Given a binary tree, prints out all of its root-to-leaf 
	 paths, one per line. Uses a recursive helper to do the work. 
	*/ 
	public void printPaths() { 
	  int[] path = new int[1000]; 
	  printPaths(root, path, 0); 
	}
	/** 
	 Recursive printPaths helper -- given a node, and an array containing 
	 the path from the root node up to but not including this node, 
	 prints out all the root-leaf paths. 
	*/ 
	private void printPaths(NodeBT node, int[] path, int pathLen) { 
	  if (node==null) return;

	  // append this node to the path array 
	  path[pathLen] =(int) node.data; 
	  pathLen++;

	  // it's a leaf, so print the path that led to here 
	  if (node.left==null && node.right==null) { 
	    printArray(path, pathLen); 
	  } 
	  else { 
	  // otherwise try both subtrees 
	    printPaths(node.left, path, pathLen); 
	    printPaths(node.right, path, pathLen); 
	  } 
	}

	/** 
	 Utility that prints ints from an array on one line. 
	*/ 
	private void printArray(int[] ints, int len) { 
	  int i; 
	  for (i=0; i<len; i++) { 
	   System.out.print(ints[i] + " "); 
	  } 
	  System.out.println(); 
	}

	/** 
	 Changes the tree into its mirror image.

	 So the tree... 
	       4 
	      / \ 
	     2   5 
	    / \ 
	   1   3

	 is changed to... 
	       4 
	      / \ 
	     5   2 
	        / \ 
	       3   1

	 Uses a recursive helper that recurs over the tree, 
	 swapping the left/right pointers. 
	*/ 
	public void mirror() {
		printMirror(root);
		
		
	}

	private void printMirror(NodeBT root) {
		if(root!=null){
			
		NodeBT temp=root.left;
		root.left=root.right;
		root.right=temp;
		printMirror(root.left);
		printMirror(root.right);
	} 
	}

	public void doubleTree() {
		doubleTree(root);
		
	}

	private void doubleTree(NodeBT node) {
		 NodeBT oldLeft;

		  if (node == null) return;

		  // do the subtrees 
		  doubleTree(node.left); 
		  doubleTree(node.right);

		  // duplicate this node to its left 
		 /* oldLeft = node.left; 
		  node.left = new NodeBT(node.data); 
		  node.left.left = oldLeft; */
		  NodeBT temp=node.right;
		  node.right=new NodeBT(node.data);
		  node.right.right=temp;
	}

	public boolean isBST() {
	  return isBST(root);
		
	}

	private boolean isBST(NodeBT node) {
		if(node==null){
			return true;
		}
		if(node.left!=null&& maxValue(node.left) > (int)node.data) 
			return(false);
		if(node.right!=null&&minValue(node.right)<=(int)node.data)
			return false;
		
		return isBST(node.left) && isBST(node.right);
	}

	public boolean isBST2() {
		// TODO Auto-generated method stub
		return isBST2(root,0,0);
	}

	private boolean isBST2(NodeBT node,int min,int max) {
		// TODO Auto-generated method stub
		 /* an empty tree is BST */
        if (node == null)
            return true;
 
        /* false if this node violates the min/max constraints */
        if ((int)node.data < min || (int)node.data > max)
            return false;
 
        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBST2(node.left, min, (int)node.data-1) &&
        		isBST2(node.right,(int) node.data+1, max));
	}

	public boolean isPesent(int num) {
		// TODO Auto-generated method stub
		return isPresent(root,num);
	}

	private boolean isPresent(NodeBT root, int num) {
		if(root==null){
			return false;
		}
		int currData=(int)root.data;
		if(currData==num){
			return true;
		}else if(num<currData){
			return isPresent(root.left, num);
		}else if(num>currData){
			return isPresent(root.right, num);
		}
	  return false;
	}

	public void pathWithSpecifiedSum(int sum) {
	 
		
	}

}

class NodeBT{

	Object data;
	NodeBT left;
	NodeBT right;
	public NodeBT(Object data) {
		this.data=data;
	}
	
}
