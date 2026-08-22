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
	    int n=in.nextInt();
	    int m=in.nextInt();
	    long arr[]=new long[n];
	    for(int i=0;i<n;i++) arr[i]=in.nextLong();
	    List<Long> list=new ArrayList<>();
	    long count=0;
	    for(int i=0;i<n;i++){
	        count+=fun(arr[i]);
	        long zeroes=0;
	        zeroes=fun2(arr[i]);
	        if(zeroes!=0) list.add(zeroes);
	    }
	    Collections.sort(list);
	    for(int i=list.size()-1;i>=0;i-=2){
	        count-=list.get(i);
	    }
	    if(count>m) System.out.println("Sasha");
	    else System.out.println("Anna");
	}
 
	}
	static long fun(long no){
	    long count=0;
	    while(no!=0){
	        no/=10;
	        count++;
	    }
	    return count;
	}
	static long fun2(long no){
	    long count=0;
	    while(no%10==0){
	        count++;
	        no/=10;
	    }
	    return count;
	}
}