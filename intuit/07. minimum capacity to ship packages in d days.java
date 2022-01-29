/*
Approach-
1. apply binary search from max element of array as low and sum of array as high.
2. for each mid check if packages can be carried within given d days.
*/
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE, high=0;
        for(int i=0;i<weights.length;i++)
        {
            high+=weights[i];
            low=Math.max(low,weights[i]);
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int sum=0, currdays=1;
            for(int wt: weights)
            {
                sum += wt;
                if(sum > mid)
                {
                    currdays++;
                    sum = wt;
                }
            }
            if(currdays<=days)
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }
}