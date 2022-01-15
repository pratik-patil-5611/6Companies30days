/*
Approach-
1. find sum of left subtree and right subtree using recursion. add them to current data.
2. check if current sum is equal to x if yes increment count.
*/
class Tree
{
    //Function to count number of subtrees having sum equal to given sum.
    int countSubtreesWithSumX(Node root, int X)
    {
	    //Add your code here.
	    count=0;
	    solve(root,X);
	    return count;
    }
    int count;
    int solve(Node root,int x)
    {
        if(root==null) return 0;
        int left=solve(root.left,x);
        int right=solve(root.right,x);
        int sum=root.data+left+right;
        if(sum==x)
            count++;
        return sum;
    }
}