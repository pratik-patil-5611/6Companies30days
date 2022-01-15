/*
Approach-
1. find sum of array.
2. use sum of array as range check if any subset exist for each element.
3. suppose subset can be found for first element then it can be also found for last element.
4. add the sums which elements sum upto.
5. use a formula suppose s1 is sum of first partition and s2 of second partition. so s1+s2=sum of array and if s1 is known s2 will be sum-s1.
    so if we put in the equation we will get sum-2s1 as difference of each subset. we will just find minimum.
*/
class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    int sum=0;
	    for(int i=0;i<n;i++)
	        sum+=arr[i];
	    ArrayList<Integer> ele=subsetsum(arr,sum,n);
	    int min=Integer.MAX_VALUE;
	    for(int i=0;i<ele.size();i++)
	    {
	        min=Math.min(min,sum-2*ele.get(i));
	    }
	    return min;
	} 
	public ArrayList<Integer> subsetsum(int arr[],int sum,int n)
	{
	    boolean dp[][]=new boolean[n+1][sum+1];
	    for(int i=0;i<=sum;i++)
	        dp[0][i]=false;
	    for(int i=0;i<=n;i++)
	        dp[i][0]=true;
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=sum;j++)
	        {
	            if(arr[i-1]<=j)
	                dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
	            else
	                dp[i][j]=dp[i-1][j];
	        }
	    }
	    ArrayList<Integer> half=new ArrayList<>();
	    for(int i=0;i<=sum/2;i++)
	    {
	        if(dp[n][i])
	            half.add(i);
	    }
	    return half;
	}
}
