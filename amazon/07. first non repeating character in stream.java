/*
Approach-
1. create queue to store the first character that was present only once.
2. create count array of 26 to represent count of letters in a string.
3. iterate throught string take character and check if frequency of character is 0 if yes then add it to queue as it is first non repeating character.
4. increment frequency of character.
5. check if queue is not empty and frequency of character at top of queue is 1. if not 1 keep removing characters from queue until we get element of frequency 1.
6. check if queue is empty that means no nonrepeating character is present add # to result else add top of queue to result.
*/
class Solution
{
    public String FirstNonRepeating(String stream)
    {
        // code here
        StringBuilder ret = new StringBuilder();
		int isRepeated[] = new int[26];
		Queue<Character> q = new LinkedList<>();
		for(int i=0;i<stream.length();i++)
		{
		    char ch=stream.charAt(i);
		    if(isRepeated[ch-'a']==0)
		        q.add(ch);
		    isRepeated[ch-'a']++;
		    while(!q.isEmpty() && isRepeated[q.peek()-'a']!=1)
		        q.remove();
		    ret.append(q.isEmpty()?'#':q.peek());
		}
		return ret.toString();
    }
}