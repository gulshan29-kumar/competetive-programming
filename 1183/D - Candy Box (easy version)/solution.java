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
		    int max=0;
		    for(int i=0;i<a;i++){
		        arr[i]=in.nextInt();
		        max=Math.max(arr[i],max);
		    }
		    int arr2[][]=new int[max+1][2];
		    for(int i=0;i<=max;i++) Arrays.fill(arr2[i],0);
		    for(int i=0;i<a;i++){
		        arr2[arr[i]][0]=arr[i];
		        arr2[arr[i]][1]++;
		    }
		    Arrays.sort(arr2,(c,d)->Integer.compare(c[1],d[1]));
		    long ans=0;
		    int n=-1;
		    for(int i=max;i>=0;i--){
		       if(n==-1) n=arr2[i][1];
		       ans+=Math.min(n,arr2[i][1]);
		       n=Math.max(0,Math.min(n,arr2[i][1])-1);
		    }
		    System.out.println(ans);
		}
	}
}