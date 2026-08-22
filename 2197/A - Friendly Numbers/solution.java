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
		    long count=0;
		    for(long i=a;i<=a+1000;i++){
		        long req=0;
		        long n=i;
		        while(n!=0){
		            req+=n%10;
		            n=n/10;
		        }
		        if(i-req==a) count++;
		    }
		    System.out.println(count);
		}
 
	}
}