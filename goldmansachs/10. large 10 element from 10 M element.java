/******************************************************************************
My approach to solve problem:
I have used min heap of size 10 to solve the problem.
1. Add first 10 elements to min heap and perform heapify for all the element.
2. When next element will come, we have to check with first element of heap as it will be smallest value.
3. If next element is greater than first element(smallest) of heap, replace first element(smallest) of heap with next element and perform heapify operation for the heap from first element.
4. If next element is smaller no need to add to heap will move to next iteration.
5. Finally ww will sort array representation of heap to return large 10 elements in increasing order;

Time complexity- O(nlogn)

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int ans[]=new int[10];
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++)
		    nums[i]=sc.nextInt();
		for(int i=0;i<10;i++)
		    ans[i]=nums[i];
		for(int i=10/2-1;i>=0;i--)
		    heapify(ans,i,10);
		for(int i=10;i<n;i++)
		{
		    if(nums[i]>ans[0])
		    {
		        ans[0]=nums[i];
		        heapify(ans,0,10);
		    }
		}
		System.out.println("Max 10 elements are:\n");
		Arrays.sort(ans);
		for(int i=0;i<10;i++)
		    System.out.println(ans[i]);
	}
	public static void heapify(int arr[],int i,int n)
	{
	    int large=i;
	    int l=2*i+1;
	    int r=2*i+2;
	    if(l<n && arr[l]<arr[large])
	        large=l;
	    if(r<n && arr[r]<arr[large])
	        large=r;
	    if(large!=i)
	    {
	        int tmp=arr[i];
	        arr[i]=arr[large];
	        arr[large]=tmp;
	        heapify(arr,large,n);
	    }
	}
}

