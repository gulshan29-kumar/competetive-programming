import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{   static int arr[];
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner in=new Scanner(System.in);
	  arr=new int[10];
	  for(int i=0;i<=9;i++){
	      int cnt=0;
	      for(int j=0;j<=9;j++){
	          for(int k=0;k<=9;k++){
	              for(int l=0;l<=9;l++){
	                  if(j+k+l==i) cnt++;
	              }
	          }
	      }
	      arr[i]=cnt;
	  }
	  int t=in.nextInt();
	  while(t-->0){
	      int a=in.nextInt();
	      long ans=1;
	      while(a!=0){
	          ans*=(arr[a%10]);
	          a/=10;
	      }
	      System.out.println(ans);
	  }
	}
}