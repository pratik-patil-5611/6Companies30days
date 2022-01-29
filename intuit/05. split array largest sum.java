/*
Approach-
1. use binary search from maximum element of array to sum of array. 
2. find the number of subarrays having sum less than mid. if we can split array in less than or equal to given m we can also split it or greater elements than mid so decrease high and set ans to mid.
3. otherwise we cannot split array into less than or equal to m subarrays, that means we cannot split or elements less than mid, so set low to mid+1;
*/
class Solution {
    public int splitArray(int[] nums, int m) {
        int st = 0, end = 0;
        for(int i=0; i < nums.length; i++)
        {
            st = Math.max(st,nums[i]);
            end += nums[i];
        }
        int ans=0;
        while(st <= end)
        {
            int mid = st + (end-st)/2;
            if(valid(nums,m,mid))
            {
                end = mid - 1;
                ans = mid;
            }
            else
                st = mid + 1;
        }
        return ans;
    }
    public boolean valid(int nums[],int m, int mid)
    {
        int st = 1,sum = 0;
        for(int i=0; i<nums.length; i++)
        {
            sum += nums[i];
            if(sum > mid)
            {
                st++;
                sum = nums[i];
            }
        }
        return st <= m;
    }
}