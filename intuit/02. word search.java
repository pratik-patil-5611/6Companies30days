/*
Approach-
1. use dfs with backtracking to find whether the string exists.
2. in dfs we will check for bounds and current index is at last of given word they will be base cases. and recursively call for adjacent elements in grid.
*/
class Solution
{
    public boolean isWordExist(char[][] board, String word)
    {
        // Code here
        int n=board.length,m=board[0].length;
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==word.charAt(0) && dfs(i,j,board,n,m,0,word,vis))
                    return true;
            }
        }
        return false;
    }
    public boolean dfs(int i,int j,char board[][],int n,int m,int ind,String word,boolean vis[][])
    {
        if(ind==word.length())   return true;
        if(i<0 || i>=n || j<0 || j>=m || vis[i][j] || board[i][j]!=word.charAt(ind))
            return false;
        vis[i][j]=true;
        boolean found=
            dfs(i+1,j,board,n,m,ind+1,word,vis) ||
            dfs(i-1,j,board,n,m,ind+1,word,vis) ||
            dfs(i,j+1,board,n,m,ind+1,word,vis) ||
            dfs(i,j-1,board,n,m,ind+1,word,vis);
        vis[i][j]=false;
        return found;
    }
}