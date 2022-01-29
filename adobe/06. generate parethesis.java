/*
Approach-
1. use recursion to generate possible strings.
2. if a and b both are 0 that means opening and closing parenthesis count has become as given count add it to result.
3. recurse till a greater than equal to 0 and b is greater than a.
*/
class Solution {
    List<String> arr=new ArrayList<String>();
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        find(n,n,"");
        return arr;
    }
    public void find(int a,int b,String s)
    {
        if(a==0 && b==0) 
        {
            arr.add(s);
            return;
        }
        if(a>=0) find(a-1,b,s+"(");
        if(b>a) find(a,b-1,s+")");
    }
}