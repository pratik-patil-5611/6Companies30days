/*
Approach-
1. create a directed graph by using the adjacent strings in given array.
2. find first non matching character from adjacent strings and add edge between them.
3. perform topological sort of formed graph.
*/
class Solution
{
    
    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<K;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<N-1;i++)
        {
            String s1=dict[i];
            String s2=dict[i+1];
            for(int j=0;j<Math.min(s1.length(),s2.length());j++)
            {
                if(s1.charAt(j)!=s2.charAt(j))
                {
                    adj.get(s1.charAt(j)-'a').add(s2.charAt(j)-'a');
                }
            }
        }
        int indegree[]=new int[K];
        char res[]=new char[K];
        for(int i=0;i<adj.size();i++)
        {
            for(int x:adj.get(i))
            {
                indegree[x]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<K;i++)
        {
            if(indegree[i]==0)
                q.add(i);
        }
        int count=0;
        while(!q.isEmpty())
        {
            int u=q.poll();
            res[count++]=(char)(u+'a');
            for(int x:adj.get(u))
            {
                if(--indegree[x]==0)
                    q.add(x);
            }
        }
        return String.valueOf(res);
    }
}