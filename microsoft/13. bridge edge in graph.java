/*
Approach-
1. take visited array to store visited nodes.
2. apply dfs and check if we skip the given edge all nodes will be visited.
3. if all nodes are visited it is not bridge edge. otherwise it is bridge edge.
*/
class Solution
{
    //Function to find if the given edge is a bridge in graph.
    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        // code here
        boolean vis[]=new boolean[V];
        dfs(c,adj,vis,c,d);
        return (vis[d]==true) ? 0 : 1;
    }
    public static void dfs(int i,ArrayList<ArrayList<Integer>> adj, boolean vis[],int c,int d)
    {
        vis[i]=true;
        for(int x:adj.get(i))
        {
            if(i==c && x==d) continue;
            if(!vis[x])
                dfs(x,adj,vis,c,d);
        }
    }
}