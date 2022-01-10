/*
Approach-
1. store the given characters in array in given sequence.
2. iterate throught the character sequence, and keep matching with the character in nuts array.
3. if characters match the position of character will be c. so swap cth and current character.
4. assign same letter to bolts array cth position.
4. if c will be greater than n-1 we have reached end of array.
*/
class Solution {
    void matchPairs(char nuts[], char bolts[], int n) {
        // code here
        char str[]={'!','#','$','%','&','*','@','^','~','.'};
        int c=0;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(str[i]==nuts[j])
                {
                    char tmp=nuts[j];
                    nuts[j]=nuts[c];
                    nuts[c]=tmp;
                    bolts[c]=nuts[c];
                    c++;
                    if(c>n-1)
                        break;
                }
            }
        }
    }
}