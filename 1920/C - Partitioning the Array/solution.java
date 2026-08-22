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
		   List<Integer> list=new ArrayList();
		   for(int i=1;i*i<=a;i++){
		       if(a%i==0){
		           list.add(i);
		           if(a/i!=i) list.add(a/i);
		       }
		   }
		   int ans=0;
		   for(int i=0;i<list.size();i++){
		       int gcd1=0;
		       for(int j=list.get(i);j<a;j++){
		         gcd1=gcd(gcd1,Math.abs(arr[j]-arr[j-list.get(i)]));
		       }
		       if(gcd1!=1) ans++;
		   }
		   System.out.println(ans);
		
		}
	}
	static int gcd(int a,int b){
	    return b==0?a:gcd(b,a%b);
	}
}