import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in =new Scanner(System.in);
	int t=in.nextInt();
	while(t-->0){
	    int n=in.nextInt();
	    long arr1[]=new long[n];
	    long arr2[]=new long[n];
	    for(int i=0;i<n;i++) arr1[i]=in.nextLong();
	    for(int i=0;i<n;i++) arr2[i]=in.nextLong();
	    long prefix[]=new long[n];
	    prefix[0]=arr2[0];
	    for(int i=1;i<n;i++) prefix[i]=arr2[i]+prefix[i-1];
	    long cnt[]=new long[n];
	    Arrays.fill(cnt,0L);
	    long ans[]=new long[n];
	    Arrays.fill(ans,0L);
	     for(int i=0;i<n;i++){
	         long target=arr1[i]+(i>0?prefix[i-1]:0L);
	         int idx=Arrays.binarySearch(prefix,target);
	         if (idx < 0) idx = -idx - 1;
           else {
              while (idx < n && prefix[idx] == target) idx++;
               }
	         if(idx<n){
	             ans[idx]+=target-(idx>0?prefix[idx-1]:0L);
	         }
	         cnt[i]+=1;
	         if(idx<n) cnt[idx]-=1;
	     }
	    for(int i=0;i<n;i++){
	        if(i>0) cnt[i]=cnt[i-1]+cnt[i];
	        ans[i]+=arr2[i]*cnt[i];
	    }
	   for(long l:ans) System.out.print(l+" ");
	   System.out.println();
	}
	}
}