/*
Approach-
1. Finding roots of quadratic equation : N^2 + N - 2X <= 0
Roots will be (-1 + sqrt(1 + 8*X)) / 2 and (-1 - sqrt(1 + 8*X)) / 2.
Second one will be discarded since it will give N < 0.
*/
class Solution{
    static int height(int N){
        // code here
        return (-1 + (int)(Math.sqrt(1 + 8 * N))) / 2;
    }
}
