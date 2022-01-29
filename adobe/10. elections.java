/*
Approach-
1. create hashmap to store frequency of names.
2. iterate for all hashmap.
3. if current element frequency is greater than previous maximum then update max as current frequency and mark that name as winner.
4. otherwise if frequency of names is same compare it with previous winner if current winner is lexicographically smaller update him/her as winner.
*/
class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        String winner="";
        int max=0;
        for(String name:map.keySet())
        {
            if(map.get(name)>max)
            {
                max=map.get(name);
                winner=name;
            }
            else if(map.get(name)==max && name.compareTo(winner)<0)
                winner=name;
        }
        return new String[]{winner,String.valueOf(max)};
    }
}