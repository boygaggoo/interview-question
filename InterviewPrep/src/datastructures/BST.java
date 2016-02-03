package datastructures;

import java.util.LinkedList;
import java.util.Queue;

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
	public Object height() {
		// TODO Auto-generated method stub
		return findHeight(root);
	}
	private int findHeight(BSTNode root) {
		// TODO Auto-generated method stub
		if(root==null){
			return -1;
		}
		return Math.max(findHeight(root.left), findHeight(root.right))+1;
	}
	public void inorder() {
		print(root,"inorder");
		
	}
	public void preorder() {
		print(root,"preorder");
		
	}    
	
	public void postorder() {
		print(root,"postorder");
		
	}  
	public void levelorder() {
		print(root,"levelorder");
		
	}
	private void print(BSTNode root, String order) {
	     if(root==null){
	    	 return;
	     }
	     if(order.equals("inorder")){
	    	 print(root.left,order);
	    	 System.out.println(root.data);
	    	 print(root.right,order);
	    	 
	     }
	     else if(order.equals("preorder")){
	    	 System.out.println(root.data);
	    	 print(root.left,order);
	    	 print(root.right,order);
	    	 
	     }
	     else if(order.equals("postorder")){
	    	 
	    	 print(root.left,order);
	    	 print(root.right,order);
	    	 System.out.println(root.data);
	    	 
	     }
	     else if(order.equals("levelorder")){
	    	 if(root==null)return;
	    	 Queue q =new LinkedList<BSTNode>();
	    	 BSTNode temp=root;
	    	 q.add(temp);
	    	 while(!q.isEmpty()){
	    		 BSTNode node=(BSTNode)q.poll();
	    		
	    		 System.out.println(node.data);
	    		 if(node.left!=null)
	    		 q.add(node.left);
	    		 if(node.right!=null)
	    		 q.add(node.right);
	    		 
	    	 }
	    	 
	    	 
	    	 
	     }
		
	     
	}
	/**
	 * Check if a tree is BST. This is not so optiomal solution
	 * @return
	 */
	public boolean bstTest() {
		return bstTest(root);
		
	}
	private boolean bstTest(BSTNode root) {
		// TODO Auto-generated method stub
		if(root==null)
			return true;
	
	  if(isBSTreeLess(root.left,root.data)&&isBSTreeGreater(root.right,root.data)
			  &&bstTest(root.left)&&bstTest(root.right)  ){
		  return true;
	  }	
	  else{
		  return false;
	  }
	}
	private boolean isBSTreeGreater(BSTNode right, Object data) {
		// TODO Auto-generated method stub
		if(right==null){
			return true;
		}
		if((int)right.data>(int)data&&isBSTreeGreater(right.right, data)&&isBSTreeGreater(right.left, data)){
			return true;
		}
		return false; 
	}
	private boolean isBSTreeLess(BSTNode left, Object data) {
		// TODO Auto-generated method stub
		if(left==null)return true;
		if((int)left.data<=(int)data &&isBSTreeLess(left.left, data)&&isBSTreeLess(left.right, data)){
			return true;
		}
		return false;
	}
	/**
	 * Interview question to check if a tree is BST
	 * This is optimal solution
	 * @return
	 */
	public boolean isBST() {
		// TODO Auto-generated method stub
		return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	private boolean isBST(BSTNode root, int minValue, int maxValue) {
		if(root==null)
			{
			return true;
			}
	    if((int)root.data>minValue&&(int)root.data<maxValue&&isBST(root.left, minValue, (int)root.data)
	    		&&isBST(root.right,(int)root.data,maxValue))
	    	{
	    	return true;
	    			
	    	}
	    else
		return false;
	}
	/**
	 * Method to delete a node from BST
	 * @param i
	 */
	public void delete(int data) {
		delete(root,data);
		
	}
	private BSTNode delete(BSTNode root, int data) {
		if(root==null)
			return null;
		else if(data<(int)root.data){
			root.left=delete(root.left, data);
		}
			else if(data>(int)root.data){
		     root.right=delete(root.right, data);		
			}
			else{
				//Case 1:If there is no child
				if(root.left==null&&root.right==null){
					root=null; 
				}
				//Case2: Only one child
				else if(root.left==null){
					BSTNode temp=root;
					root=root.right;
					temp=null;
					}
				
				else if(root.right==null){
					BSTNode temp=root;
					root=root.left;
					temp=null;
					}
				//case 3:Two children
				else{
					BSTNode temp=FindMin(root.right);
					root.data=temp.data;
					root.right=delete(root.right, (int)temp.data);
				}
			}
		return root;
		}
	private BSTNode FindMin(BSTNode node) {
		// TODO Auto-generated method stub
		while(node.left!=null){
			node=node.left;
	}
		return node;
	}
	}
	
	
	

	
	

