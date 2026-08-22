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
		   long a=in.nextLong();
		   long b=in.nextLong();
		   long c=in.nextLong();
		   long d=in.nextLong();
		   
		  if(gcd(a,c)==1&&gcd(b,d)==1&&gcd(a,b)<=2){
		      System.out.println("Yes");
		  }
		  else System.out.println("No");
		    
		}
 
	}
	static long gcd(long a,long b){
	    if(b==0) return a;
	    return gcd(b,a%b);
	}
}