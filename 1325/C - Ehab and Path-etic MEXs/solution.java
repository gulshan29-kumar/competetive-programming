import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{  static List<Integer> list;
   static ArrayList<Integer> arr[];
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    list=new ArrayList<>();
	    arr=new ArrayList[n];
	    for(int i=0;i<n;i++) arr[i]=new ArrayList<>();
	    int arr1[][]=new int[n][2];
	    for(int i=0;i<n-1;i++){
	        int par=in.nextInt();
	        int child=in.nextInt();
	        arr1[i][0]=par-1;
	        arr1[i][1]=child-1;
	        arr[par-1].add(child-1);
	        arr[child-1].add(par-1);
	    }
	    int ans[]=new int[n];
	    Arrays.fill(ans,-1);
	    int idx=-1;
	    for(int i=0;i<n-1;i++){
	       if(arr[i].size()>=3) {
	           idx=i;
	           break;
	       }
	    }
	    int label=0;
	    if(idx!=-1){
	        for(int i=0;i<n-1;i++){
	            if(arr1[i][0]==idx||arr1[i][1]==idx){
	                if(label<3){
	                    ans[i]=label++;
	                }
	            }
	        }
	    }
	    for(int i=0;i<n-1;i++){
	        if(ans[i]==-1) ans[i]=label++;
	    }
	    for(int i=0;i<n-1;i++){
	        System.out.println(ans[i]);
	    }
 
	}
}