import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{   static int mod=(int)1e9+7;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		String str=in.next();
	    long count=0;
		long ans=1;
		for(int i=0;i<str.length();i++){
		   if(str.charAt(i)=='a') count++;
		   else if(str.charAt(i)=='b'){
		       ans=(ans*(count+1))%mod;
		       count=0;
		       while(i<str.length()&&str.charAt(i)=='b') i++;
		       i--;
		   }
		}
		if(count!=0) ans=(ans*(count+1))%mod;
		ans--;
		System.out.println(ans);
		
 
	}
}