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
