package Trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void test() {
	BinaryTree bt=new BinaryTree(3);
	BinaryTree bt2=new BinaryTree(2);
//	BinaryTree bt2=new BinaryTree(1,bt,new BinaryTree(3,new BinaryTree(5),new BinaryTree(7)));
	bt.addLSubtree(bt2);
	bt2.addRSubtree(new BinaryTree(1));
	bt.addRSubtree(bt2);
	System.out.println(bt.getHeight());
    bt.inorder();
	}

}
