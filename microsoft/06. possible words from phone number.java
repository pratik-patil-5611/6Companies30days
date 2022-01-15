/*
Approach-
1. create a map and store possible strings for each digit.
2. use recursion for finding all strings.
*/
class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList<String> possibleWords(int a[], int N)
    {
        // your code here 
        ArrayList<String> ans=new ArrayList<>();
        Map<Integer,String> map=new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        find(a,N,0,"",ans,map);
        return ans;
    }
    public static void find(int a[],int n,int ind,String s,ArrayList<String> ans,Map<Integer,String> map)
    {
        if(ind>=n)
        {
            ans.add(s);
            return;
        }
        String temp=map.get(a[ind]);
        for(int i=0;i<temp.length();i++)
            find(a,n,ind+1,s+temp.charAt(i),ans,map);
        return;
   }
}