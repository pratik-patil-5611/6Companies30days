/*
Approach-
1. first sort the array.
2. then take 2 for loops as first 2 indexes and take left and right as two pointers.
3. we will combine 2 for loops and 2 pointer appraoch.
4. check if element at i,j,left and right pointer sums to target if yes add it to the ans.
5. else check if sum is less than target then increment left pointer.
6. else decrement right pointer.
*/
class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<=n-4;i++)
        {
            if(i!=0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n;j++)
            {
                if(j!=i+1 && arr[j]==arr[j-1]) continue;
                int left=j+1;
                int right=n-1;
                while(left<right)
                {
                    int sum=arr[i]+arr[j]+arr[left]+arr[right];
                    if(sum==k)
                    {
                        ArrayList<Integer> a1=new ArrayList<>();
                        a1.add(arr[i]);
                        a1.add(arr[j]);
                        a1.add(arr[left]);
                        a1.add(arr[right]);
                        ans.add(a1);
                        left++;right--;
                        while(left<right && arr[left]==arr[left-1]) left++;
                        while(left<right && arr[right]==arr[right+1]) right--;
                    }
                    else if(sum<k)
                        left++;
                    else
                        right--;
                    
                }
            }
        }
        return ans;
    }
}