/*
Approach-
1. I have used dfs traversal which will calculate length of all adjacent 1's at one time and send them to 0 for marking it as visited. 
2. after each dfs the max length will be maximum of current max and previous answer.
*/
class Solution
{
    //Function to find unit area of the largest region of 1s.
    int dx[]={0,-1,-1,-1,0,1,1,1};
    int dy[]={1,1,0,-1,-1,-1,0,1};
    int max=0;
    public int findMaxArea(int[][] grid)
    {
        // Code here
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                max=0;
                if(grid[i][j]==1)
                {
                    dfs(grid,i,j,grid.length,grid[0].length);
                    ans=Math.max(max,ans);
                }
            }
        }
        return ans;
    }
    public void dfs(int grid[][],int i,int j,int n,int m)
    {
        if(i<0 || j<0 || i>=n || j>=m) return;
        if(grid[i][j]==0) return;
        max++;
        grid[i][j]=0;
        for(int k=0;k<8;k++)
        {
            dfs(grid,i+dx[k],j+dy[k],n,m);
        }
    }
}