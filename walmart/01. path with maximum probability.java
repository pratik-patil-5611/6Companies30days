/*
Approach-
1. apply dijkstras algorithm.
*/
class Solution {
    class Pair
    {
        int node;
        double prob;
        Pair(int num,double prob)
        {
            this.node=num;
            this.prob=prob;
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<List<Pair>> adj=new ArrayList<>();
    
    for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
    }
    
    int c=0;
    //creating the adj.. list
    for(int p[]:edges){
        int u=p[0];
        int v=p[1];
        adj.get(u).add(new Pair(v,succProb[c]));
        adj.get(v).add(new Pair(u,succProb[c]));
        c++;
    }
    //creating the visited array 
    int vis[]=new int[n];
    double res=Integer.MIN_VALUE;
    //putiing the elements in PQ such that larger value of probability is polled out
    
    Queue<Pair> pq=new PriorityQueue<>((a,b)->Double.compare(b.prob, a.prob));
    //initial probability=1
    pq.add(new Pair(start,1));
    while(!pq.isEmpty()){
        Pair it=pq.poll();
        int node=it.node;
        double prob=it.prob;
        if(node==end)res=Math.max(res,prob);
        vis[node]=1;
        for(Pair x:adj.get(node)){
            if(vis[x.node]==0){
                pq.add(new Pair(x.node,prob*x.prob));
            }
        }
    }
    return res==Integer.MIN_VALUE?0:res;
    }
}
