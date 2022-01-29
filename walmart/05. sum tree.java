/*
Approach-
1. find sum of left and right subtree using recursion and set data at root as left subtree sum + right subtree sum.
*/
class Solution{
    public void toSumTree(Node root){
         //add code here.
         find(root);
    }
    int find(Node root)
    {
        if(root==null)
            return 0;
        int l=find(root.left);
        int r=find(root.right);
        int d=root.data;
        root.data=l+r;
        return root.data+d;
    }
}
