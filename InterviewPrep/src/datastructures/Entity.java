package datastructures;


 
class Solution {
    public BSTNode lowestCommonAncestor(BSTNode root, BSTNode p, BSTNode q) {
        return lcaHelper(root, p, q).node;
    }
 
    public Entity lcaHelper(BSTNode root, BSTNode p, BSTNode q){
        if(root == null) return new Entity(0, null);
 
        Entity left = lcaHelper(root.left, p, q);
        if(left.count==2) 
            return left;
 
        Entity right = lcaHelper(root.right,p,q);
        if(right.count==2) 
            return right;
 
        int numTotal = left.count + right.count;
        if(root== p || root == q){
            numTotal++;
        }
 
        return new Entity(numTotal, root);      
    }
}
class Entity{
    public int count;
    public BSTNode node;
 
    public Entity(int count, BSTNode node){
        this.count = count;
        this.node = node;
    }
}