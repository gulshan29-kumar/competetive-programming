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
		    long arr[][]=new long[a][2];
		    int i=0;
		    long max=0;
		    while(a-->0){
		        long l=in.nextLong();
		        long r=in.nextLong();
		        arr[i][0]=l;
		        arr[i][1]=r;
		        max=Math.max(arr[i][1],max);
		        i++;
		    }
		    long low=0;
		    long high=max;
		    while(low<=high){
		        long mid=low+(high-low)/2;
		        if(ispossible(arr,mid)){
		            high=mid-1;
		        }
		        else low=mid+1;
		    }
		    System.out.println(low);
		}
 
	}
	static Boolean ispossible(long arr[][],long k){
	    Boolean bool=true;
	    long max=k;long min=(-1L)*k;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i][0]>max||arr[i][1]<min){
	            bool=false;
	            break;
	        }
	       max=Math.min(max+k,arr[i][1]+k);
	       min=Math.max(min-k,arr[i][0]-k);
	    }
	    return bool;
	}
}