/*
Approach-
1. only valid combination will be AAA and BBB. so just check for them in given string.
*/
class Solution {
    public boolean winnerOfGame(String colors) {
        String[] toFind = {"AAA", "BBB"};
        int[] lastIndex = {-1, -1};
        int player = 0;
        while (true) {
            int i = colors.indexOf(toFind[player], lastIndex[player] + 1);
            if (i == -1) {
                return player != 0;
            } else {
                lastIndex[player] = i;
                player = player ^ 1;
            }
        }
    }
}
