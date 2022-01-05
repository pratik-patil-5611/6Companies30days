/*
Approach- 
1. initialize count to 1 as first character count will be 1.
2. add first character to ans.
3. iterate from first index to last.
4. if current character is equal to previous increment count of current character.
5. else add count of current character and next unique character to ans. set count to 1.
6. ans string will store resultant string.
*/
class GfG
 {
	String encode(String str)
	{
          //Your code here
          String ans="";
          int count=1,n=str.length();
          ans+=str.charAt(0);
          for(int i=1;i<n;i++)
          {
              if(str.charAt(i)==str.charAt(i-1))
                count++;
            else
            {
                ans+=count;
                ans+=str.charAt(i);
                count=1;
            }
          }
          ans+=count;
          return ans;
	}
	
 }