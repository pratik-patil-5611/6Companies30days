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