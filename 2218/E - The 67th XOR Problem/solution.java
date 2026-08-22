import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{   static int arr[];
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int a=in.nextInt();
		    arr=new int[a];
		    for(int i=0;i<a;i++) arr[i]=in.nextInt();
		    long ans=0;
		    for(int i=0;i<a;i++){
		        for(int j=i+1;j<a;j++){
		            ans=Math.max(ans,arr[i]^arr[j]);
		        }
		    }
		    System.out.println(ans);
		    
		}
 
	}
}