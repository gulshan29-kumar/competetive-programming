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
		    int arr[]=new int[3*a];
		    a=3*a;
		    Arrays.fill(arr,-1);
		    int cnt=1;
		    for(int i=0;i<a;i+=3){
		        arr[i]=cnt++;
		    }
		    for(int i=0;i<a;i++){
		        if(arr[i]==-1) System.out.print(cnt++ +" ");
		        else System.out.print(arr[i]+" ");
		    }
		   System.out.println();
		}
 
	}
}