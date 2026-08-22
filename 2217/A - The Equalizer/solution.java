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
		    int b=in.nextInt();
		    int arr[]=new int[a];
		    long sum=0;
		    for(int i=0;i<a;i++) {
		        arr[i]=in.nextInt();
		        sum+=arr[i];
		    }
		    if(sum%2==1||(sum%2==0&&a*b%2==0)) System.out.println("Yes");
		    else System.out.println("No");
		}
 
	}
}