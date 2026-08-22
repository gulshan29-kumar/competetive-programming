import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		   int arr[]=new int[n];
		   for(int i=0;i<n;i++) arr[i]=in.nextInt();
		   int dp[]= new int[n+1];
		   dp[n]=0;
		   for(int i=n-1;i>=0;i--){
		       dp[i]=dp[i+1]+1;
		       int j=i+arr[i]+1;
		       if(j<=n) dp[i]=Math.min(dp[i],dp[j]);
		   }
		   System.out.println(dp[0]);
        }
	}
}