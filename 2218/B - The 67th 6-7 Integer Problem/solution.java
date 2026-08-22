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
		   int sum=0;
		   int max=Integer.MIN_VALUE;
		   for(int i=0;i<7;i++){
		       int c=in.nextInt();
		       max=Math.max(max,c);
		       sum+=c;
		   }
		   System.out.println(-1*sum+2*max);
		}
 
	}
}