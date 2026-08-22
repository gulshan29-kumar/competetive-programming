import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		    int a=in.nextInt();
		    long h1[]=new long[a];
		    long h2[]=new long[a];
		    for(int i=0;i<a;i++) h1[i]=in.nextLong();
		    for(int i=0;i<a;i++) h2[i]=in.nextLong();
		    long dp1[]=new long[a];
		    long dp2[]=new long[a];
		    dp1[0]=h1[0];
		    dp2[0]=h2[0];
		    for(int i=1;i<a;i++){
		        dp1[i]=Math.max(dp1[i-1],dp2[i-1]+h1[i]);
		        dp2[i]=Math.max(dp2[i-1],dp1[i-1]+h2[i]);
		    }
		    System.out.println(Math.max(dp1[a-1],dp2[a-1]));
 
	}
}