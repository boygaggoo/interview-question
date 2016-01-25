package Trees;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	TreeNode root;
	
	
	Tree(Object data){
		root=new TreeNode();
		root.data=data;
		root.children=new ArrayList<TreeNode>();
	}

	public void addChild(Tree nw) {
		root.children.add(nw.root);
		
	}

	public Object getChild() {
		
		return root.children.get(0).data;		
	}

	
	public int size(){
		return root.size();
	}
	

}
