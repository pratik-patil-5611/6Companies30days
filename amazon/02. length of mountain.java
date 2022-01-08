/*
Approach-
1. start traversing array.
2. increment value of i till we get current element is smaller than next that is we are walking up.
3. check if the base set is same as i that means we cannot walk up because current element is greater than next so move to next iteration.
4. else set peak to current i and now walk down that is increment i till current element is greater than next.
5. check if peak is same as i if yes we cannot walk down as current element is smaller than next.
6. finally set ans to maximum of previous answer and i-base+1. that is current element index and index when we started climbing up.
*/
class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length<3) return 0;
        int n=arr.length,ans=0,i=0;
        while(i<n)
        {
            int base=i;
            while(i+1<n && arr[i]<arr[i+1])
                i++;
            if(i==base)
            {    
                i++;
                continue;
            }
            int peak=i;
            while(i+1<n && arr[i]>arr[i+1])
                i++;
            if(i==peak)
            {   
                i++;
                continue;
            }
            ans=Math.max(ans,i-base+1);
        }
        return ans;
    }
}