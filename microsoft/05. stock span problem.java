/*
Approach-
1. find next greater element to left of current element.
*/
class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        Stack<Integer> st=new Stack<Integer>();
        st.push(0);
        int ans[]=new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++)
        {
            while(!st.isEmpty() && price[st.peek()]<=price[i])
                st.pop();
            ans[i]=(st.isEmpty())?i+1:i-st.peek();
            st.push(i);
        }
        return ans;
    }
    
}