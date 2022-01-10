/*
Approach-
1. for serializing into array perform dfs traversal of tree. if node is null add -1 to list. 
2. for deserializing check if index is greater than array size or the element at given index is null then we will skip the node and increment index.
3. else create node with given index from array. call function recursively for left and right subtree.
*/
class Tree 
{
    //Function to serialize a tree and return a list containing nodes of tree.
	public void serialize(Node root, ArrayList<Integer> A) 
	{
	    //code here
	    if(root==null) 
	    {
	        A.add(-1);
	        return;
	    }
	    A.add(root.data);
	    serialize(root.left,A);
	    serialize(root.right,A);
	}
	int ind=0;
	//Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A)
    {
        //code here
        if(A.size()-1<ind || A.get(ind)==-1)
        {
            ind++;
            return null;
        }
        Node root=new Node(A.get(ind++));
        root.left=deSerialize(A);
        root.right=deSerialize(A);
        return root;
    }
}