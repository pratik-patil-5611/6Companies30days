/*
Approach-
1. iterate till number is not 0.
2. decrement number for indexing it to 0;
3. find remainder by dividing by 26 and convert it to respective character.
4. add the character to answer and divide number by 26.
5. It is just converting number from mod 10 system to mod 26 system.
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