import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    long c=in.nextLong();
		   long k=in.nextLong();
		    long arr[]=new long[n];
		    for(int i=0;i<n;i++) arr[i]=in.nextLong();
		    Arrays.sort(arr);
		    for(int i=0;i<n;i++){
		        if(arr[i]<=c){
		            if(k>0) {
		                long used=Math.min(c-arr[i],k);
		                c+=used;
		                k-=used;
		            }
		             c+=arr[i];
		        }
		    }
		    System.out.println(c);
		}
 
	}
}