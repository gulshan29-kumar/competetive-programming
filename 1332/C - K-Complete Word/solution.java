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
		    int b=in.nextInt();
		    String str=in.next();
		    int c=a/b;
		    int ans=0;
		    for(int i=0;i<b/2;i++){
		        Map<Character,Integer> map=new HashMap<>();
		        int j=i;
		        int k=b-i-1;
		        while(j<a){
		            map.put(str.charAt(j),map.getOrDefault(str.charAt(j),0)+1);
		          map.put(str.charAt(k),map.getOrDefault(str.charAt(k),0)+1);
		            j+=b;
		            k+=b;
		        }
		        long max=0;
		        for(Character ch:map.keySet()){
		            max=Math.max(map.get(ch),max);
		        }
		        ans+=(2*c-max);
		    }
		    if(b%2==1){
		        int j=b/2;
		       Map<Character,Integer> map=new HashMap<>();
		        while(j<a){
		            map.put(str.charAt(j),map.getOrDefault(str.charAt(j),0)+1);
		            j+=b;
		        }
		         long max=0;
		        for(Character ch:map.keySet()){
		            max=Math.max(map.get(ch),max);
		        }
		        ans+=c-max;
		    }
		    System.out.println(ans);
		}
 
	}
}