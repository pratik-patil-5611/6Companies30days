/*
Approach-
1. I have used the concept of directions.
2. if direction is 0 we will traverse from left to right and increment top index.
3. if direction is 1 we will traverse from top to bottom and decrement right index.
4. if direction is 2 we will traverse from right to left and decrement bottom index.
5. if direction is 3 we will traverse from bottom to top and increment left index.
6. after each iteration we will modify direction to current+1 mod 4.
*/
class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        int dir=0;
        int top=0,left=0,right=c-1,bot=r-1;
        ArrayList<Integer> ans=new ArrayList<>();
        while(left<=right && top<=bot)
        {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                    ans.add(matrix[top][i]);
                top++;
            }
            else if(dir==1)
            {
                for(int i=top;i<=bot;i++)
                    ans.add(matrix[i][right]);
                right--;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                    ans.add(matrix[bot][i]);
                bot--;
            }
            else if(dir==3)
            {
                for(int i=bot;i>=top;i--)
                    ans.add(matrix[i][left]);
                left++;
            }
            dir=(dir+1)%4;
        }
        return ans;
    }
}