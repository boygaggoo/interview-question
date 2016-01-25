package Trees;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	
	List<TreeNode> children;
	Object data;
	


public int size() {
   int sum=0;
   for(TreeNode child:children){
	   sum=sum+child.size();
   }
	return 1+sum;
}
}