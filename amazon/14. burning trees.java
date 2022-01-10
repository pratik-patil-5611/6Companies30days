/*
Approach-
1. find dfs traversal of the tree and add parent of nodes to hashmap. if any nodes data matches with target set start as that node.
2. create visited list and call find method.
3. in find if node is already visited or is null return.
4. else add node to visited list as it will be visited.
5. ans will be maximum of current ans and time.
6. recursively call find method for left subtree, right subtree and parent by increasing time by 1.
*/
class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
    public int minTime(Node root, int target) 
    {
        // Your code goes here
        dfs(root,null,target);
        ArrayList<Node> vis=new ArrayList<>();
        find(start,vis,0);
        return ans;
    }
    int ans=0;
    HashMap<Node,Node> map=new HashMap<>();
    Node start;
    public void find(Node root,ArrayList<Node> vis,int time)
    {
        if(root==null) return;
        if(vis.contains(root)) return;
        vis.add(root);
        ans=Math.max(ans,time);
        find(root.left,vis,time+1);
        find(root.right,vis,time+1);
        find(map.get(root),vis,time+1);
    }
    public void dfs(Node root,Node parent,int target)
    {
        if(root==null) return;
        map.put(root,parent);
        if(root.data==target)
        {
            start=root;
        }
        dfs(root.left,root,target);
        dfs(root.right,root,target);
    }
}