/*
Approach-
1. we will update the current area with the sum of current element and its previous elements to adjacent element.
2. if array length is 1 or 2 return respective answers.
3. iterate in array from 2nd index to last.
4. if index is 2 maximum till that point will be sum of current element and first element.
5. otherwise the maximum sum till that point will be addition of current element with maximum of current index - 2 and current index - 3 th element.
6. finally answer will be maximum last and second last element.
*/
class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        if(n==1) return arr[0];
        if(n==2) return Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++)
        {
            if(i==2)
                arr[i]+=arr[i-2];
            else
                arr[i]+=Math.max(arr[i-2],arr[i-3]);
        }
        return Math.max(arr[n-1],arr[n-2]);
    }
}