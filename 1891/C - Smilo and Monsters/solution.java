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
		    long arr[]=new long[n];
		    long sum=0;
		    for(int i=0;i<n;i++){
		        arr[i]=in.nextLong();
		        sum+=arr[i];
		    }
		    Arrays.sort(arr);
		    long sum1=0;
		    long ans=0;
		    for(int i=n-1;i>=0;i--){
		        sum1+=arr[i];
		        if(sum1<=sum/2) ans++;
		        else break;
		    }
		    if(sum1-arr[n-(int)ans-1]!=sum/2) ans++;
		    ans+=(sum+1)/2;
		
		System.out.println(ans);
}
	}
}