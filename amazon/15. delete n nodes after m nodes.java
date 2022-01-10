/*
Approach-
1. iterate until head is null.
2. initialize temporary m count and move current node to next node until current is not null and m is greater than 0.
3. save current pointer to prev and set temporary n count.
4. move current to next until current is not null and n is greater than zero.
5. if previous is not null set prev next to head.
*/
class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        // your code here
        while(head!=null)
        {
            int tmpm=M;
            while(head!=null && --tmpm>0) head=head.next;
            int tmpn=N;
            Node prev=head;
            while(head!=null && tmpn-->0) head=head.next;
            if(prev!=null)
            {
                head=head!=null?head.next:null;
                prev.next=head;
            }
        }
    }
}