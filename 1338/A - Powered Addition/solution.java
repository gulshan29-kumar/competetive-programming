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
		    int a=in.nextInt();
		    long arr[]=new long[a];
		    for(int i=0;i<a;i++){
		        arr[i]=in.nextLong();
		    }
		    long diff=0;
		    long max=arr[0];
		    for(int i=0;i<a;i++){
		        if(max>arr[i]){
		            diff=Math.max(diff,max-arr[i]);
		        }
		        max=Math.max(max,arr[i]);
		    }
		    long ans=0;
		    long mul2=1;
		    while(diff>0){
		        ans++;
		        diff-=mul2;
		        mul2*=2;
		    }
		    System.out.println(ans);
		}
 
	}
}