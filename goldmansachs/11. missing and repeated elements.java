/*
Approach-
1. first traverse array and use element at index as index to array.
2. If number is visited first time it will be greater than 0 so multiply it with -1.
3. If we found number less than 0. its absolute will be repeated element.
4. traverse array for finding missing element if we get element greater than zero missing element will be its index+1.
*/
class Solve {
    int[] findTwoElement(int a[], int n) {
        // code here
        int r=0,m=0;
        for(int i=0;i<n;i++)
        {
            if(a[Math.abs(a[i])-1]<0)
                r=Math.abs(a[i]);
            else
                a[Math.abs(a[i])-1]*=-1;
                
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>0)
            {
                m=i+1;
                break;
            }
        }
        return new int[]{r,m};
    }
}