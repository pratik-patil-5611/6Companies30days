/*
Approach-
1. reverse the number and multiply n r times.
*/
class Solution
{
    int mod=1000000007;
    long power(int N,int R)
    {
        //Your code here
        return recur(N,R)%mod;
    }
    long recur(int N,int R)
    {
        if(R==0) return 1;
        long result=power(N,R/2);
        result = (result * result) % mod;
        if(R%2 == 0)
            return result;
        else
            return result * N;
    }
}
