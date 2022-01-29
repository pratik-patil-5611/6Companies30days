/*
Approach-
1. iterate through array using two pointers i and j.
2. j will keep increasing till sum of array will be less than given sum. means size of window will be increased.
3. i will be increment if becomes greater than the given sum. means size of window will be decreased.
*/
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int i=0,j=0,sum=arr[0];
        ArrayList<Integer> arr1=new ArrayList<>();
        while(i<n && j<n)
        {
            if(sum==s)
            {
                arr1.add(i+1);
                arr1.add(j+1);
                return arr1;
            }
            if(sum<s)
            {
                j++;
                if(j<n)
                    sum+=arr[j];
            }
            else
                sum-=arr[i++];
        }
        arr1.add(-1);
        return arr1;
    }
}