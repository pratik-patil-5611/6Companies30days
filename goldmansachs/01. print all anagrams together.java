/*
Approach-
1. create hashmap.
2. traverse for all array of strings.
3. sort the string which will be used as key to hashmap.
4. if key exists in hashmap add the current string to existing key list.
5. else create new list and add current string to new list and add it to hashmap.
6. print all values of hashmap.
*/
class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:string_list)
        {
            char chars[]=str.toCharArray();
            Arrays.sort(chars);
            String key=String.valueOf(chars);
            List<String> temp=new ArrayList<>();
            if(map.containsKey(key))
                temp=map.get(key);
            temp.add(str);
            map.put(key,temp);
        }
        List<List<String>> ans=new ArrayList<>();
        for(List<String> st:map.values())
        {
            ans.add(st);
        }
        return ans;
    }
}
