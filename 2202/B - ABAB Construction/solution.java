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
		    String str=in.next();
		    if(a%2==1){
		        str='b'+str;
		        a++;
		    }
		    boolean bool=true;
		    for(int i=0;i<a;i++){
		        if(i%2==1&&str.charAt(i)==str.charAt(i-1)&&str.charAt(i)!='?'){
		            bool=false;
		            break;
		        }
		    }
		    if(bool) System.out.println("Yes");
		    else System.out.println("No");
		    
		}
 
	}
}