package Trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class BSTCayTest {

	@Test
	public void test() {
		BSTCay bst=new BSTCay();
		bst.addNode(20);
		bst.addNode(10);
		bst.addNode(40);
		bst.addNode(30);
		bst.printInorder();

		bst.printPreorder();
		bst.printPostorder();
		System.out.println("LevelOrder");
		bst.levelOrder();
	}

}
