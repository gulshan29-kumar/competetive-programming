import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long m=in.nextLong();
		int k=in.nextInt();
		long arr[]=new long[n];
		for(int i=0;i<n;i++){
		    arr[i]=in.nextInt();
		}
		List<Long> list=new ArrayList<>();
		for(int i=0;i<n;i++){if(i>0) list.add(arr[i]-arr[i-1]);}
		Collections.sort(list);
		long sum=k;
		for(int i=0;i<n-k;i++){
		    sum+=list.get(i);
		}
		System.out.println(sum);
 
	}
}