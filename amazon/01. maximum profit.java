/*
Approach-
1. create dp array.
2. iterate through array for k+1 times into n times here k is number of transactions and n is number of stocks.
3. after each step set maxso to maximum of previous transaction minus the element at previous index and current 
	maximum so at the last, element at last index will be maximum profit after that transaction.
*/
class Solution {
    static int maxProfit(int k, int n, int A[]) {
        // code here
        int dp[][]=new int[k+1][n];
        int max_so=Integer.MIN_VALUE;
        for(int i=1;i<=k;i++)
        {
            max_so=Integer.MIN_VALUE;
            for(int j=1;j<n;j++)
            {
                max_so=Math.max(max_so,dp[i-1][j-1]-A[j-1]);
                dp[i][j]=Math.max(dp[i][j-1],max_so+A[j]);
            }
        }
        return dp[k][n-1];
    }
}