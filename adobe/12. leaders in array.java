/*
Approach-
1. iterate from end to start.
2. set max as last element and keep checking if any element is greater than max. add that element to ans and update max.
3. reverse ans list.
*/
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(arr[n-1]);
        int max=arr[n-1];
        int i=n-2;
        while(i>=0)
        {
            if(max<=arr[i])
            {
                ans.add(arr[i]);
                max=arr[i];
            }
            i--;
        }
        Collections.reverse(ans);
        return ans;
    }
}