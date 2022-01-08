/*
Approach-
1. traverse array from start.
2. we will use dequeue to store maximum element maximum element is stored at first of dequeue.
3. when new element will come we will check till element at last of dequeue is less than next element. if all element are less than next element next element will be stored at first.
4. we will check is current index is equal to current index minus k to remove first element from array.
5. if i will be greater than k-1 then add first element of dequeue to answer. 
*/
class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            while(!dq.isEmpty() && arr[dq.getLast()]<=arr[i])
                dq.removeLast();
            dq.addLast(i);
            if(dq.getFirst()==i-k)
                dq.removeFirst();
            if(i>=k-1)
                ans.add(arr[dq.getFirst()]);
        }
        return ans;
    }
}