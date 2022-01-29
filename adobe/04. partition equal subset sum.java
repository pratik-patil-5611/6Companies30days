/*
Approach-
1. iterate through array and calculate sum of array. if sum is odd it is not possible to divide array in two equal parts.
2. else check if any subset exists with half sum of array using dynamic programming if yes other part of sum will be also present so return true.
*/
class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum=0;
        for(int i=0;i<N;i++)
            sum+=arr[i];
        if(sum%2!=0)
            return 0;
        if(solve(arr,N,sum/2)) return 1;
        return 0;
    }
    static boolean solve(int arr[],int n,int sum)
    {
        boolean dp[][]=new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(i==0)
                    dp[i][j]=false;
                if(j==0)
                    dp[i][j]=true;
            }
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(arr[i-1]<=j)
                    dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
}