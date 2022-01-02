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