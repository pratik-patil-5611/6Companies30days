/*
Approach-
1. find count of maximum difference using dynamic programming. same as Longest Common Subsequence.
*/
class Solution {
    int lengthOfLongestAP(int[] A, int n) {
        // code here
        HashMap<Integer,Integer>[]dp = new HashMap[n];
        int ans  = Integer.MIN_VALUE;
        for(int i=0; i<A.length;i++){
            dp[i] = new HashMap<Integer, Integer>();
            for(int j=0; j<i;j++){
                int diff = A[i]-A[j];
                dp[i].put(diff, dp[j].getOrDefault(diff,1)+1);
                ans = Math.max(ans, dp[i].get(diff));
            }
        }
        return ans==Integer.MIN_VALUE?1: ans;
    }
}