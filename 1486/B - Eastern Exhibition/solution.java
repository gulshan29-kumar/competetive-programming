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
		    int q=in.nextInt();
		    List<Long> list1=new ArrayList<>();
		    List<Long> list2=new ArrayList<>();
		    for(int i=0;i<q;i++){
		        list1.add(in.nextLong());
		        list2.add(in.nextLong());
		    }
		    Collections.sort(list1);
		    Collections.sort(list2);
		    long x=0;
		    long y=0;
		    if(list1.size()%2==0){
		        x=Math.abs(list1.get(list1.size()/2-1)-list1.get(list1.size()/2))+1;
		        y=Math.abs(list2.get(list2.size()/2-1)-list2.get(list2.size()/2))+1;
		    }
		    else{
		        x=1;
		        y=1;
		    }
		    System.out.println(Math.max(1,x*y));
		}
 
	}
}