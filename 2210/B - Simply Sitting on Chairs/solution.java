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
		    for(int i=0;i<a;i++) arr[i]=in.nextInt();
		    int cntmax=0;
		    for(int i=0;i<a;i++){
		        if(arr[i]>i+1) cntmax++;
		    }
		    System.out.println(a-cntmax);
		}
 
	}
}