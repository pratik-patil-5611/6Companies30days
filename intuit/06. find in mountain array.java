/*
Approach-
1. find peak element using binary search.
2. search in first half from peak element using binary search.
3. if element is not present in first half search in second half using binary search.
*/
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        if(mountainArr.length()<3) return -1;
        int low=1, high=mountainArr.length()-1;
        int peak = -1;
        while(low<=high)
        {
            int mid = (low + high) / 2;
            int num = mountainArr.get(mid), num1 = mountainArr.get(mid - 1), num2 = mountainArr.get(mid + 1);
            if(num > num1 && num > num2)
            {
                peak = mid;
                break;
            }
            else if(num > num1 && num < num2)
                low = mid + 1;
            else
                high = mid - 1;    
        }
        low =0;
        high=peak;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int num = mountainArr.get(mid);
            if(num == target)
                return mid;
            else if(num > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        low =peak;
        high=mountainArr.length()-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int num = mountainArr.get(mid);
            if(num == target)
                return mid;
            else if(num < target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}