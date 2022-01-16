/*
Approach-
1. keep adding steps to sum. if sum is equal to given destination return steps.
2. else check if sum has become greater than destination. if yes check if sum - destination is divisible by 2.
*/
class Solution{
    static int minSteps(int D){
        // code here
        int steps=0,sum=0;
        while(true)
        {
            sum+=steps;
            steps++;
            if(sum==D)
            {
                return steps-1;
            }
            if(sum>D && (sum-D)%2==0)
            {
                return steps-1;
            }
        }
        //return 0;
    }
}