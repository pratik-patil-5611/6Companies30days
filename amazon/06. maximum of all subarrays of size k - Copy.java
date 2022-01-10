/*
Approach-
1. create priority queue in reverse order so as the maximum element will be at top.
2. add first k elements from array to priorityqueue.
3. add peek element from priorityqueue to ans and remove first element.
4. iterate from kth element to last.
5. add next element to priorityqueue, add top of priorityqueue to the answer.
6. keep removing i-k th elements from start to maintain size of window as k.
7. It can be done by using dequeue to using same approach as ipl matchday question.
*/
class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        for(i=0;i<k;i++)
            pq.add(arr[i]);
        arr1.add(pq.peek());
        pq.remove(arr[0]);
        for(;i<n;i++)
        {
            pq.add(arr[i]);
            arr1.add(pq.peek());
            pq.remove(arr[i-k+1]);
        }
        return arr1;
    }
}