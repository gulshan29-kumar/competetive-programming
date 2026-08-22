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
		    long arr[]=new long[n];
		    for(int i=0;i<n;i++) arr[i]=in.nextLong();
		    for(int i=0;i<n;i++){
		        int countmax=0;
		        int countmin=0;
		        for(int j=i+1;j<n;j++){
		            if(arr[j]>arr[i]) countmax++;
		           if(arr[i]>arr[j]) countmin++;
		        }
		        System.out.print(Math.max(countmin,countmax)+" ");
		    }
		    System.out.println();
		}
 
	}
}