import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{   static int arr[];
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int x=in.nextInt();
		    int y=in.nextInt();
		    int total=x+y;
		    if(total%2==0){
		        x--;
		    }
		    else y--;
		    if(y-x<0||x<0){
		        System.out.println("No");
		        continue;
		    }
		    int arr[][]=new int[total-1][2];
		    int cnt=2;
		    for(int i=0;i<total-1;i++){
		        arr[i][0]=1;
		        arr[i][1]=cnt++;
		    }
		     cnt=2;
		    for(int i=total-1-x;i<total-1;i++){
		        arr[i][0]=cnt++;
		    }
		    System.out.println("Yes");
		    for(int i=0;i<total-1;i++){
		        System.out.println(arr[i][0]+" "+arr[i][1]);
		    }
		}
 
	}
}