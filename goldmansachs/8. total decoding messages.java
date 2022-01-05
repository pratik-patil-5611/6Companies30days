/*
Approach-
1. create a dp array.
2. if first character in string is 0 no decoding is possible return 0.
3. initialize first index of dp 0 and second index to 1.
4. iterate from 2nd index of string till last.
5. take two numbers to store count.
6. check if string has any element greater than 0 at previous index set first number to dp[i-1].
7. check if string contains 1 at 2nd previous index or 2nd position has 2 and first previous
 position has number less than 7 as last alphabet number is 26 if yes set second number to dp[i-2].
8. set current number in dp as addition of first and second number.
*/
class Solution
{
    public int CountWays(String str)
    {
        // code here
        int n = str.length();
        int[] dp = new int[n + 1];
        if(str.charAt(0) == '0')
            return 0;
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++)
        {
            int c1 = 0, c2 = 0;
            if(str.charAt(i-1) > '0')
                c1 = dp[i-1];
            if(str.charAt(i-2) == '1' || (str.charAt(i-2) == '2' && str.charAt(i-1) < '7'))
                c2 = dp[i-2];
            dp[i] = (c1+c2)%1000000007;
        }
        return dp[n];
    }
}