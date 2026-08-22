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
		   int arr[]=new int[a];
		   for(int i=0;i<a;i++){
		       arr[i]=in.nextInt();
		   }
		   Arrays.sort(arr);
		   int cnt=1;
		   int max=1;
		   for(int i=1;i<a;i++){
		       if(arr[i]-arr[i-1]==1) cnt++;
		       else if(arr[i]-arr[i-1]==0) continue;
		       else {
		           max=Math.max(cnt,max);
		           cnt=1;
		       }
		   }
		    max=Math.max(cnt,max);
		    System.out.println(max);
		   
		}
 
	}
}