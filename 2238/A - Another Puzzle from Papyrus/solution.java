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
		    int arr2[]=new int[a];
		    int direct=1;
		    int sum1=0;
		    int sum2=0;
		    for(int i=0;i<a;i++){
		        arr[i]=in.nextInt();
		        sum1+=arr[i];
		    }
		    for(int i=0;i<a;i++){
		        arr2[i]=in.nextInt();
		        if(arr[i]<arr2[i]) direct=0;
		        sum2+=arr2[i];
		    }
		    Arrays.sort(arr);
		    Arrays.sort(arr2);
		    boolean bool=true;
		    if(direct==1){
		        System.out.println(sum1-sum2);
		        continue;
		    }
		    for(int i=0;i<a;i++){
		        if(arr[i]<arr2[i]) bool=false;
		    }
		    if(bool) System.out.println(b+(sum1-sum2));
		    else System.out.println(-1);
		}
 
	}
}