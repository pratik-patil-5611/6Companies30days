class Solution{
    static String matrixChainOrder(int arr[], int n){
        // code here
        int t[][]=new int[101][101];
        int brackets[][]=new int[101][101];
        int i,j,k,temp;
        int min=0;
        for(i=0;i<n;  i++)
            t[i][i] = 0;
        for(int L=2; L<n; L++)
        {
            for(i=0; i<n-L+1; i++)
            {
                j = i+L-1;
                t[i][j] = Integer.MAX_VALUE;
                for(k=i; k<j; k++)
                {
                    temp = t[i][k] + t[k+1][j] + arr[i-1]*arr[k]*arr[j];
                    if(temp<t[i][j])
                    {  
                        t[i][j] = temp;
                        brackets[i][j] = k;
                    }
                }
            }
        }
        char name = 'A';
        String s="";
        OptimalParanthesis(1,n-1, n, brackets , name, s);
        return s;
    }
    static void OptimalParanthesis(int i, int j, int n, int brackets[][], char name, String s)
    {
        if(i==j)
        {
            s+=name++;
            return;
        }
        s+='(';
        OptimalParanthesis(i,brackets[i][j], n, brackets, name,s);
        OptimalParanthesis(brackets[i][j] + 1, j, n, brackets, name,s);
        s+=')';
    }
}