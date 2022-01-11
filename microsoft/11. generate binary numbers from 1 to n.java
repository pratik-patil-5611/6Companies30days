/*
Approach-
1. set i to 1 and iterate till it is less or equal to n.
2. find binary of each number and keep adding it to ans.
3. for finding binary we will add number%2 to binary number and divide number by 2. converting decimal to binary.
*/
class solve{
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
        // Your code here
        ArrayList<String> ans=new ArrayList<>();
        int i=1;
        while(i<=N)
        {
            String binary=find(i);
            ans.add(binary);
            i++;
        }
        return ans;
    }
    static String find(int N)
    {
        String bin="";
        while(N>0)
        {
            bin=N%2+bin;
            N/=2;
        }
        return bin;
    }
    
}