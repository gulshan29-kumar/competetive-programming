import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{  static int mod=(int)1e9+7;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	   Scanner in=new Scanner(System.in);
	   int t=in.nextInt();
	   while(t-->0){
	       int a=in.nextInt();
	       int k=in.nextInt();
	       int arr[]=new int[a];
	       long sum=0;
	       for(int i=0;i<a;i++) arr[i]=in.nextInt();
	       long max=0;
	       long smax=0;
	       for(int i=0;i<a;i++){
	           sum=(sum+arr[i])%mod;
	           max=Math.max(arr[i],(max+arr[i]));
	           smax=Math.max(smax,max);
	       }
	       long ans=(sum-smax)%mod;
	       if(smax>0){
	           while(k-->0){
	               smax=(2*smax)%mod;
	               
	           }
	           ans=(ans+smax)%mod;
	       }
	       if(ans<0) ans+=mod;
	       System.out.println(ans);
	   }
 
	}
}