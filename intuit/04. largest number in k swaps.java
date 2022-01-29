/*
Approach-
1. iterate through using 2 pointers. check if character at j is greater than i, if yes, swap elements at i and jth location and compare it current ans, if it is greater change answer.
2. finally backtrack for checking for other elements.
*/
class Solution
{
    //Function to find the largest number after k swaps.
    static String ans;
    public static String findMaximumNum(String str, int k)
    {
            //code here.
            ans=str;
            solve(str.toCharArray(),k);
            return ans;
    }
    public static void solve(char ch[],int k)
    {
        if(k==0) return;
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[j]>ch[i])
                {
                    swap(ch,i,j);
                    String s=new String(ch);
                    if(ans.compareTo(s)<0)
                        ans=s;
                    solve(ch,k-1);
                    swap(ch,i,j);
                }
            }
        }
    }
    static void swap(char c[],int i,int j)
    {
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;
    }
}