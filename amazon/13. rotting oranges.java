/*
Approach-
1. first traverse all grid and add oranges which are rotten to queue and count the fresh oranges.
2. if fresh oranges are 0 then answer will be 0 as no fresh orange are present to rot.
3. perform bfs traversal until queue becomes empty.
4. iterate for all adjacent elements at one time. set orange to rotten if currents adjacent are fresh. decrement the fresh oranges count.
5. increment time.
6. check if fresh oranges are greater than 0 if yes return -1;
7. else return time.
*/
class Solution
{
    String colName (long n)
    {
        // your code here
        String ans="";
        while(n!=0)
        {
            n--;
            int remain=(int)n%26;
            char ch=(char)(remain+'A');
            ans=String.valueOf(ch)+ans;
            n=n/26;
        }
        return ans;
    }
}