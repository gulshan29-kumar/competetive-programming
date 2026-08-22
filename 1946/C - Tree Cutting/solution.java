import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{  static int count=0;
   static ArrayList<Integer> arr[];
   static int k;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    count=0;
		    int q=in.nextInt();
		     k=in.nextInt();
		    arr=new ArrayList[q];
		    for(int i=0;i<q;i++){
		        arr[i]=new ArrayList<>();
		    }
		    for(int i=0;i<q-1;i++){
		        int p=in.nextInt()-1;
		        int c=in.nextInt()-1;
		        arr[p].add(c);
		        arr[c].add(p);
		    }
		    int low=1;
		    int high=q;
		    while(low<=high){
		        int mid=(low+high)/2;
		        count=0;
		        int size=dfs(0,-1,mid);
		        if(count>=k+1){
		            low=mid+1;
		        }
		        else high=mid-1;
		    }
		  
		    System.out.println(low-1);
		}
	}
	static int dfs(int parent,int realpar,int mid){
	    int size=1;
	    for(int child:arr[parent]){
	       if(child!=realpar) size+=dfs(child,parent,mid);
	    }
	    if(size>=mid){
	        count++;
	        return 0;
	    }
	    return size;
	}
}