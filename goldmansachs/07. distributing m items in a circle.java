import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int k=sc.nextInt();
		System.out.println("Position of delivered item is "+lastPos(n,m,k));
	}
	public static int lastPos(int n,int m,int k)
	{
	   return ((k+m-1)%n==0)?n:(k+m-1)%n;
	}
}