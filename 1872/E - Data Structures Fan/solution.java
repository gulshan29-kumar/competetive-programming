import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		  int n=in.nextInt();
		  long arr[]=new long[n];
		  for(int i=0;i<n;i++) arr[i]=in.nextLong();
		  long prefix[]=new long[n+1];
		  prefix[0]=0;
		  for(int i=1;i<=n;i++) prefix[i]=arr[i-1]^prefix[i-1];
		  String str=in.next();
		  long xrz=0;
		  long xro=0;
		  for(int i=0;i<n;i++){
		      if(str.charAt(i)=='1') xro^=arr[i];
		      else xrz^=arr[i];
		  }
		  
		  int q=in.nextInt();
		  List<Long> list=new ArrayList<>();
		  while(q-->0){
		      int c=in.nextInt();
		      if(c==1){
		          int d=in.nextInt();
		          int e=in.nextInt();
		          long req=prefix[d-1]^prefix[e];
		          xrz^=req;
		          xro^=req;
		      }
		      else{
		          int d=in.nextInt();
		          if(d==0) list.add(xrz);
		          else list.add(xro);
		      }
		  }
		  for(long it:list) System.out.print(it+" ");
		  System.out.println();
        }
	}
}