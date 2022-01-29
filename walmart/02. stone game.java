/*
Approach-
1. alice will always select first so she will select maximum of both ends and bob will select minimum of both ends.
2. finally return true if alice is greater than bob else false.
*/
class Solution {
    public boolean stoneGame(int[] piles) {
        int low=0,high=piles.length-1;
        int alice=0, bob=0;
        while(low<high)
        {
            alice+=Math.max(piles[low],piles[high]);
            bob+=Math.min(piles[low],piles[high]);
            low++;
            high--;
        }
        return alice > bob;
    }
}
