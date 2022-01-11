/*
Approach-
1. I have performed bfs traversal of tree and added null after each level.
2. if next node is null and q is empty then we will stop as no node is left.
3. if q is not empty we will add null to queue to mark as one level.
4. if next node is not null we will set right of next node to queues peek.
5. finally add left and right node to queue.
*/
class Solution
{
    //Function to connect nodes at same level.
    public void connect(Node root)
    {
        // Your code goes here.
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node temp=q.poll();
            if(temp==null)
            {
                if(q.isEmpty())
                    break;
                else
                {
                    q.add(null);
                    continue;
                }
            }
            else
                temp.nextRight=q.peek();
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
        
    }
}