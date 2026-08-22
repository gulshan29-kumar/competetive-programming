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
		    int m=in.nextInt();
		    int h=in.nextInt();
		    int arr1[]=new int[a];
		    int arr2[]=new int[a];
		    int arr3[]=new int[a];
		    for(int i=0;i<a;i++){
		        arr1[i]=in.nextInt();
		        arr2[i]=arr1[i];
		        arr3[i]=0;
		    }
		    int r=0;
		    while(m-->0){
		        int c=in.nextInt()-1;
		        int b=in.nextInt();
		        if(arr3[c]<r){
		            arr1[c]=arr2[c];
		            arr3[c]=r;
		        }
		        arr1[c]+=b;
		        if(arr1[c]>h){
		            r++;
		        }
		    }
		    for(int i=0;i<a;i++){
		        if(arr3[i]<r){
		            System.out.print(arr2[i]+" ");
		        }
		        else {
		            System.out.print(arr1[i]+" ");
		        }
		    }System.out.println();
		  
		}
 
	}
}