import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int arr[]=new int[a];
		int max=Integer.MIN_VALUE;
		long sum=0;
		for(int i=0;i<a;i++) {
		    arr[i]=in.nextInt();
		    max=Math.max(max,arr[i]);
		    sum+=arr[i];
		}
		if(sum%2==0&&sum-max>=max) System.out.println("Yes");
		else System.out.println("No");
 
	}
}