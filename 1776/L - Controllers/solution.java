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
		    String str=in.next();
		    int cntp=0;
		    int cntm=0;
		    for(int i=0;i<a;i++){
		        if(str.charAt(i)=='+') cntp++;
		        else cntm++;
		    }
		    int q=in.nextInt();
		    while(q-->0){
		        long a1=in.nextLong();
		        long b1=in.nextLong();
		        long gcd=gcd1(a1,b1);
		        if(cntp==cntm){
		            System.out.println("Yes");
		            continue;
		        }
		        if(a1==b1) {
		            System.out.println("No");
		            continue;
		        }
		        long diff=Math.abs(cntp-cntm);
		        long temp=a1;
		         a1=b1/gcd;
		        b1=temp/gcd;
		        long d=Math.abs(a1-b1);
		        if(diff%d!=0){
		            System.out.println("No");
		            continue;
		        }
		        if((a1+b1)*diff/d<=a) System.out.println("Yes");
		        else System.out.println("No");
		    }
		
 
	}
	static long gcd1(long n1,long n2){
	    while(n1!=0&&n2!=0){
	        long temp=n2;
	        n2=n1%n2;
	        n1=temp;
	    }
	    if(n1==0) return n2;
	    return n1;
	}
}