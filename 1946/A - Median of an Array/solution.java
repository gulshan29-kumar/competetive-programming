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
		    if(a==1) {
		        System.out.println(1);
		        continue;
		    }
		    Arrays.sort(arr);
		    int idx=(a+1)/2-1;
		    int prev=arr[idx];
		    idx++;
		    int ans=1;
		    while(idx<a){
		        if(arr[idx]!=prev) break;
		        ans++;
		        idx++;
		    }
		    System.out.println(ans);
		}
 
	}
}