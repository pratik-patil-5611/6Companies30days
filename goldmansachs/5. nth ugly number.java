/*
Approach-
1. first element of sequence will be 1.
2. the next element we will get by multiplying minimum character with 2,3 and 5.
3. iterate from 1 index to last.
4. find minimum of next number multiplied by 2,3 and 5.
5. minimum will be the next number in sequence.
6. check which number is selected and set next values of 2,3 and 5 multiple.
7. element at n-1th index will be answer.
*/
class Solution {
    /* Function to get the nth ugly number*/
    long getNthUglyNo(int n) {
        // code here
        long arr[]=new long[n];
        arr[0]=1;
        long next2=2,next3=3,next5=5;
        int i2=0,i3=0,i5=0;
        for(int i=1;i<n;i++)
        {
            long next=(long)Math.min(next2,Math.min(next3,next5));
            arr[i]=next;
            if(next==next2)
            {
                i2++;
                next2=arr[i2]*2;
            }
            if(next==next3)
            {
                i3++;
                next3=arr[i3]*3;
            }
            if(next==next5)
            {
                i5++;
                next5=arr[i5]*5;
            }
        }
        return arr[n-1];
        
    }
}