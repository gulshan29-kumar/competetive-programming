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
		  
		       for(int i=1;i<=a;i++){
		           System.out.print((a-i+1)+" ");
		       }
		       
		   System.out.println();
		   
		}
 
	}
}