/*
Approach-
1. apply binary search from 1 to max element of array.
2. find mid and check find total time to east bananas by dividing each number by mid.
3. if total time is less than or equal to given time. koko can eat all bananas in given time. that means she can eat bananas in more than mid too, so set high equal to mid -1 and ans to mid.
4. otherwise set low to mid + 1.
*/
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]>max)
                max=piles[i];
        }
        int low=1,high=max,time=0,ans=Integer.MAX_VALUE;
        while(low<=high)
        {
            time=0;
            int mid=low+(high-low)/2;
            for(int i=0;i<piles.length;i++)
            {
                time+=Math.ceil(1.0*piles[i]/mid);
            }
            if(time<=h)
            {
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans==Integer.MAX_VALUE?max:ans;
    }
}