class Solution{
    static String printMinNumberForPattern(String S){
        // code here
        Stack<Integer> st=new Stack<>();
        int num=1;
        String ans="";
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            if(ch=='D')
                st.push(num++);
            else
            {
                st.push(num++);
                while(!st.isEmpty())
                {
                    ans+=String.valueOf(st.pop());
                }
            }
        }
        st.push(num);
        while(!st.isEmpty())
            ans+=String.valueOf(st.pop());
        return ans;
    }
}
