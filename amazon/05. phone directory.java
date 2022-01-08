/*
Approach-
1. first add elements of array to set to remove duplicate contacts.
2. then change size of contact array to set size and add elements to contact array.
3. sort the contacts array.
4. iterate from first character till all characters in search string, find pattern using substring function.
5. check if character matches with the string array using startswith function.
6. if no match is found add 0 to list for the pattern.
7. add pattern to ans. 
*/
class Solution{
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
        // code here
        HashSet<String> hs=new HashSet<>();
        for(String ele:contact)
            hs.add(ele);
        contact=new String[hs.size()];
        int k=0;
        for(String ele:hs)
            contact[k++]=ele;
        Arrays.sort(contact);
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            String pat=s.substring(0,i+1);
            ArrayList<String> tmp=new ArrayList<>();
            for(int j=0;j<contact.length;j++)
            {
                if(search(pat,contact[j]))
                    tmp.add(contact[j]);
            }
            if(tmp.isEmpty())
                tmp.add("0");
            ans.add(tmp);
        }
        //Collections.sort(ans);
        return ans;
    }
    static boolean search(String str,String s)
    {
        return s.startsWith(str);
    }
}