package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BTIdeserve {
	class QueueNode{
		TreeNode root;
		int level;
		public QueueNode(TreeNode root,int level) {
			this.root=root;
			this.level=level;
		}
	}
	
		 
	    private TreeNode root;
	     
	    public TreeNode getRoot() {
	        return root;
	    }
	 
	    class TreeNode {
	         
	        private int data;
	        private TreeNode left;
	        private TreeNode right;
	         
	        public TreeNode(int data, TreeNode left, TreeNode right) {
	            super();
	            this.data = data;
	            this.left = left;
	            this.right = right;
	        }
	 
	        public int getData() {
	            return data;
	        }
	 
	        public void setData(int data) {
	            this.data = data;
	        }
	 
	        public TreeNode getLeft() {
	            return left;
	        }
	 
	        public void setLeft(TreeNode left) {
	            this.left = left;
	        }
	 
	        public TreeNode getRight() {
	            return right;
	        }
	 
	        public void setRight(TreeNode right) {
	            this.right = right;
	        }
	 
	        public TreeNode() {
	            super();
	        }
	 
	        public TreeNode(int data) {
	            super();
	            this.data = data;
	        }
	         
	        @Override
	        public String toString() {
	            return data+""; 
	        }
	    }
	 
	    public static void main(String[] args) {
	        BTIdeserve tree = new BTIdeserve();
	        tree.createSampleTree();
	        System.out.println("InOrder:");
	        tree.printInOrder();
	        System.out.println("\nPreOrder:");
	        tree.printPreorder();
	        System.out.println("\nPostOrder:");
	        tree.printPostorder();
	        System.out.println("\nLevelOrder:");
	        tree.printLevelOrder();
	        System.out.println("\nRightView of Tree:");
	        tree.printRightView();
	        System.out.println("\nNo Sibblings Node:");
	        tree.printNoSiblings();
	        
	      
	        
	    }
	 
	    private void printNoSiblings() {
			printNoSiblings(root);
			
		}

		private void printNoSiblings(TreeNode root) {
			 if(root==null){
				 return;
			 }
			 if(root.left!=null&&root.right==null){
				 System.out.println(root.left.data);
			 }
			 if(root.right!=null&&root.left==null){
				 System.out.println(root.right.data);
			 }
			 printNoSiblings(root.left);
			 printNoSiblings(root.right);
			 
			
		}

		private void printRightView() {
			printRightView(root);
			
		}

		private void printRightView(TreeNode root) {
			Queue<QueueNode> queue=new LinkedList<>();
			int maxlevel=-1;
			if(root!=null){
				queue.add(new QueueNode(root, 0));
			}
			while(!queue.isEmpty()){
				QueueNode n=queue.remove();
				if(maxlevel<n.level){
					maxlevel=n.level;
					System.out.print(n.root.data+" ");
					
				}
				if(n.root.right!=null){
					queue.add(new QueueNode(n.root.right,n.level+1));
				}
				if(n.root.left!=null){
					queue.add(new QueueNode(n.root.left,n.level+1));
				}
			}
			
			
		}
		

		private void printLevelOrder() {
		  levelOrder(root);
			
		}

		private void printPreorder() {
			printPreOrder(root);
			
		}

		private void printPreOrder(TreeNode root) {
			if(root == null) {
	            return;
	        }
			 System.out.print(root.data+" ");
			 printPreOrder(root.left);
			 printPreOrder(root.right);
			
			
		}

		/*
	     * Create a sample tree
	     *              1
	     *      2               3
	     * 4        5       6       7
	     * 
	     */
	    public void createSampleTree() {
	        root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), null));       
	    }
	 
	    
	    private void printInOrder() {
			printInOrder(root);
			
		}

		private void printInOrder(TreeNode root) {
			if(root == null) {
	            return;
	        }
			printInOrder(root.left);
			 System.out.print(root.data+" ");
			 
			 printInOrder(root.right);
			
			
		}
	    /*
	     * Print postorder traversal
	     */
	    public void printPostorder() {
	        printPostorder(root);
	    }
	     
	    private void printPostorder(TreeNode root) {
	        if(root == null) {
	            return;
	        }
	        printPostorder(root.getLeft());
	        printPostorder(root.getRight());
	        System.out.print(root.getData() + " ");
	    }
	    private void levelOrder(TreeNode root) {
	    	Queue<TreeNode> data=new LinkedList<>();
	        if(root != null) {
	            data.add(root);
	        }
	        while(!data.isEmpty()){
	            TreeNode n=data.remove();
	            System.out.print(n.data+" ");
	            if(n.left!=null){
	            	data.add(n.left);
	            }
	            if(n.right!=null){
	            	data.add(n.right);
	            }
	        }
	      
	    }
	}


