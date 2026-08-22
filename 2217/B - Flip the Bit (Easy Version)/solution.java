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
		    int arr[]=new int[a];
		    for(int i=0;i<a;i++){
		        arr[i]=in.nextInt();
		    }
		    int k=in.nextInt();
		    int flip=Math.abs(arr[k-1]-1);
		    int front=0;
		    while(front<a&&arr[front]==arr[k-1]) front++;
		    int prev=arr[k-1];
		    int ans=0;
		    if(front<k-1){
		        for(int i=front;i<k-1;i++){
		            if(arr[i]!=prev){
		                ans++;
		                prev=arr[i];
		            }
		        }
		    }
		    int end=a-1;
		    prev=arr[k-1];
		    int ans2=0;
		    while(end>0&&arr[end]==arr[k-1]) end--;
		    if(end>=k){
		        for(int i=end;i>=k;i--){
		            if(arr[i]!=prev){
		                ans2++;
		                prev=arr[i];
		            }
		        }
		    }
		    if(ans%2==1) ans++;
		    if(ans2%2==1) ans2++;
		    System.out.println(Math.max(ans,ans2));
		    
		}
 
	}
}