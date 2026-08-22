import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int arr[]=new int[a];
		int gcd=0;
		int cnt4=0;
		for(int i=0;i<a;i++){
		    arr[i]=in.nextInt();
		    gcd=gcd1(gcd,arr[i]);
		    if(arr[i]==1) cnt4++;
		}
		if(gcd!=1){
		    System.out.println(-1);
		    return ;
		}
		if(cnt4!=0){
		    System.out.println(a-cnt4);
		    return ;
		    
		}
		long ans=Integer.MAX_VALUE;
		for(int i=a-1;i>=0;i--){
		    gcd=arr[i];
		    int cnt=0;
		    for(int j=i-1;j>=0;j--){
		        cnt++;
		        gcd=gcd1(gcd,arr[j]);
		        if(gcd==1) break;
		    }
		    if(gcd==1) ans=Math.min(ans,cnt);
		}
		System.out.println(ans+(a-1));
 
	}
	static int gcd1(int a,int b){
	    return b==0?a:gcd1(b,a%b);
	}
}