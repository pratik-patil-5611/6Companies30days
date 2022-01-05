/*
Approach-
1. number of squares will be sum of squares of all numbers before the number till 1 including that number square too.
2. it can be generalized as squares in nxn board will be 1^2+2^2+3^2....+n^2.
3. it can be written by formula used in solution.
*/
class Solution {
    static Long squaresInChessBoard(Long n) {
        // code here
        return (n*(n+1)*(2*n+1))/6;
    }
}