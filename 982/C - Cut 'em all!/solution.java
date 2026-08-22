import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{   static ArrayList<Integer> adj[];
    static boolean arr[];
    static int ans;
    static boolean possible;
    static int size[];
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int nodes=in.nextInt();
		adj=new ArrayList[nodes];
		ans=0;
		possible=false;
		arr=new boolean[nodes];
		size=new int[nodes];
		Arrays.fill(arr,false);
		for(int i=0;i<nodes;i++) adj[i]=new ArrayList<>();
		for(int i=0;i<nodes-1;i++){
		    int par=in.nextInt()-1;
		    int child=in.nextInt()-1;
		    adj[child].add(par);
		    adj[par].add(child);
		}
		dfs(0,-1);
		if(nodes%2==1) System.out.println(-1);
		else {
		    for(int i=1;i<nodes;i++) {
		        if(size[i]%2==0) ans++;
		    }
		    System.out.println(ans);
		}
 
	}
	static int dfs(int curr,int par){
	    arr[curr]=true;
	    int sum=1;
	    for(int it:adj[curr]){
	        if(it!=par&&!arr[it]) sum+=dfs(it,curr);
	    }
	    return size[curr]=sum;
	}
}
 