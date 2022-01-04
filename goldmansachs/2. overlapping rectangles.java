/*
Approach-
1. check if one rectangle is to the left of other if yes, no rectangles will overlap.
2. similarly check if one rectangle is to the bottom of other if yes, no rectangles will overlap.
3. in all cases rectangles will overlap.
*/
class Solution {
    int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
        // code here
        if(L1[0]>R2[0] || L2[0]>R1[0])
            return 0;
        if(L1[1]<R2[1] || L2[1]<R1[1])
            return 0;
        return 1;
    }
}