/*
Approach-
1. find count of maximum difference using dynamic programming. same as Longest Common Subsequence.
*/
class Solution {
    int lengthOfLongestAP(int[] A, int n) {
        // code here
        double[][] dp = new double[n+1][k+1];
        double MOD = 1e9;
        MOD = MOD + 7;
        for(int i =0;i <= n;i++){
            
            for(int j = 0;j <= k;j++){
                if(i == 0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][k]*21%MOD;
                    
                    if(j > 0){
                        dp[i][j] = (dp[i][j] + dp[i-1][j-1]*5%MOD) % MOD;
                    }
                }
                
            }
        
        }
            return (int)dp[n][k];
    }
}