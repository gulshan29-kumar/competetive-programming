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
		    int k=in.nextInt();
		    Boolean bool=true;
		    StringBuilder str=new StringBuilder(in.next());
		    int cnt0=0;
		    int cnt1=0;
		    int other=0;
		    for(int i=k;i<a;i++){
		      if(str.charAt(i)=='1'){
		          if(str.charAt(i%k)=='0'){
		              bool=false;
		              break;
		          }
		          str.setCharAt(i%k,'1');
		      }
		      if(str.charAt(i)=='0'){
		          if(str.charAt(i%k)=='1'){
		              bool=false;
		              break;
		          }
		          str.setCharAt(i%k,'0');
		      }
		    }
		  
		    for(int i=0;i<a;i++){
		        if(i>=k){
		            if(cnt0>k/2||cnt1>k/2) {
		                bool=false;
		                break;
		            }
		        }
		        if(str.charAt(i)=='0') cnt0++;
		        else if(str.charAt(i)=='1') cnt1++;
		        else other++;
		         if(i>=k){
		            if(str.charAt(i-k)=='0') cnt0--;
		            else if(str.charAt(i-k)=='1') cnt1--;
		            else other--;
		        }
		    }
		    if(cnt0>k/2||cnt1>k/2) {
		                bool=false;
		            }
		    if(bool) System.out.println("Yes");
		    else System.out.println("No");
		}
 
	}
}