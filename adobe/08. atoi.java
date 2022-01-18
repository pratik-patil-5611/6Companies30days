/*
Approach-
1. iterate through string check if first character is minus if yes then set flag to true as value is negative.
2. if we get character other than 0 to 9 we will return -1.
3. else we will keep adding number to ans by multiplying it with 10 to generate number.
4. finally if flag is true return - of ans else return ans.
*/
class Solution
{
    int atoi(String str) {
	    // Your code here
    	int n=str.length();
    	int i=0,ans=0;
    	boolean flag=false;
    	while(i<n)
    	{
    	    if(i==0 && str.charAt(i)=='-')
    	    {
    	        flag=true;
    	        i++;
    	        continue;
    	    }
    	    if(i!=0 && str.charAt(i)<'0' || str.charAt(i)>'9')
    	        return -1;
    	    ans=(ans*10)+str.charAt(i)-'0';
    	    i++;
    	}
    	if(flag)
    	    return -ans;
    	return ans;
    }
}