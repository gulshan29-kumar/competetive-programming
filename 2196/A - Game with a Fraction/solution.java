import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{  static long mul2[];
   static long mul3[];
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    long p=in.nextLong();
		    long q=in.nextLong();
		    if(p>=q){
		        System.out.println("Alice");
		        continue;
		    }
		    boolean bool=false;
		    long  low=1;
		    long  high=(long)1e18;
		    while(low<=high){
		        long mid=low+(high-low)/2;
		        if((p-2*mid)>=0 &&(q-3*mid)>=0&&p-2*mid==q-3*mid){
		            bool=true;
		            break;
		        }
		        if((p-2*mid)>=0 &&(q-3*mid)>=0 &&(p-2*mid)-(q-3*mid)<0) low=mid+1;
		        else high=mid-1;
		    }
		    if(bool) System.out.println("Bob");
		    else System.out.println("Alice");
		}
        
	}
}