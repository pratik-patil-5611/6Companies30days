/*
Approach-
1. use the rules soduku is based on.
2. create row and col arrays of 9x9 as each of 9 rows will have 9 number.
3. use the number int matrix as index and set that number in row and col array.
4. if number is not 0 then that number has occures twice so return 0.
5. same check for 3x3 grids using grid array.
*/
class Solution{
    static int isValid(int mat[][]){
        // code here
        int row[][]=new int[9][9];
        int col[][]=new int[9][9];
        int grid[][][]=new int[3][3][9];
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(mat[i][j]>0 && mat[i][j]<=9)
                {
                    int num=mat[i][j]-1;
                    if(row[i][num]!=0)
                        return 0;
                    row[i][num]=1;
                    if(col[j][num]!=0)
                        return 0;
                    col[j][num]=1;
                    if(grid[i/3][j/3][num]!=0)
                        return 0;
                    grid[i/3][j/3][num]=1;
                }
            }
        }
        return 1;
    }
}