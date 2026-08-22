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
		    long ans=0;
		    for(int i=1;i<=a;i++){
		        long temp=a/i;
		        ans+=temp*temp;
		    }
		    System.out.println(ans);
		}
 
	}
}