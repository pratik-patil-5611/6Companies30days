/*
Approach-
1. the idea here is to first find transpose of matrix.
2. then reversing the row order that is first row will become last row, second row will become second last row and so on.
*/
class GFG
{
    static void rotate(int matrix[][]) 
    {
        // Code Here
        int n=matrix.length;
        int m=matrix[0].length;
        //transpose of matrix
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
            }
        }
        //reversing rows
        for(int i=0;i<n/2;i++)
        {
            for(int j=0;j<m;j++)
            {
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[m-i-1][j];
                matrix[m-i-1][j]=tmp;
            }
        }
    }
}