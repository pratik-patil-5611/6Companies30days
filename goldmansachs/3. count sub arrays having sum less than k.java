/*
1. travserse the array multiply current product with next element of array.
2. if product is less than k then ans will be incremented by i-j+1;
3. else divide product with current element until product is greater than k and increment j.
4. we are using two pointer technique. we will increment i till we get product greater than k. 
if we get greater than k we will increment j pointing to first element and it will be removed from current product and answer after every instance will be current count + i-j+1
*/
class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int ans=0,j=0;
        long prod=1;
        for(int i=0;i<n;i++)
        {
            prod*=a[i];
            while(j<n && prod>=k)
            {
                prod/=a[j];
                j++;
            }
            ans+=i-j+1;
        }
        return ans;
    }
}