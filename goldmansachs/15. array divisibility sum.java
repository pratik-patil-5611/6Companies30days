/*
Approach-
1. create a remainder array for storing remainder count of array element.
2. iterate through array.
3. find remainder of current element at increment that count.
4. check if odd number of elements have remainder 0 then we cannot divide the array return false.
5. initialize i to 1 j to last location of remainder array that is k-1.
6. check until i is less than j that if number of elements at the ith location and jth location is not equal. if it is not equal return false.
7. else they are valid increment i and decrement j.
8. if i and j both will be at same location at the end that will be middle element of array. if it is even number of times return true otherwise false.
*/
class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        int rem[]=new int[k];
        for(int val:nums)
            rem[val%k]++;
        if(rem[0]%2!=0)
            return false;
        int i=1,j=k-1;
        while(i<j)
        {
            if(rem[i]!=rem[j])
                return false;
            i++;
            j--;
        }
        if(i==j && rem[i]%2==1)
            return false;
        return true;
        
    }
}