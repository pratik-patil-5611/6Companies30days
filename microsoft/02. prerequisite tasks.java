/*
Approach-
1. the question can be treated as topological sort of a graph we cannot complete next task until previous is completed.
2. create a adjacency list representing the given task prerequisites.
3. create indegree array to store the indegree of all nodes.
4. add all indegree nodes to queue.
5. iterate until queue will become empty.
6. increment count as count of nodes. remove element from queue iterate for all its adjacent nodes and decrease there indegree by 1.
7. if indegree of any node becomes 0 add to queue.
8. check if count is equal to N if yes all N tasks can be performed.
*/
class Solution {
    public boolean isPossible(int N, int[][] prerequisites)
    {
        // Your Code goes here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<N;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<prerequisites.length;i++)
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        int cnt=0;
        int indegree[]=new int[N];
        for(int i=0;i<N;i++)
        {
            for(int j:adj.get(i))
                indegree[j]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<N;i++)
        {
            if(indegree[i]==0)
                q.add(i);
        }
        while(!q.isEmpty())
        {
            int u=q.poll();
            cnt++;
            for(int v:adj.get(u))
            {
                if(--indegree[v]==0)
                    q.add(v);
            }
        }
        return cnt==N;
    }
    
}