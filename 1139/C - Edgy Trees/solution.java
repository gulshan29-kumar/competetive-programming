import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{   static ArrayList<Integer> list[];
    static int mod=(int)1e9+7;
    static boolean visited[];
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
	    int nodes=in.nextInt();
	    int  k=in.nextInt();
	    list=new ArrayList[nodes];
	    for(int i=0;i<nodes;i++){
	        list[i]=new ArrayList<>();
	    }
	    for(int i=0;i<nodes-1;i++){
	        int par=in.nextInt()-1;
	        int child=in.nextInt()-1;
	        int req=in.nextInt();
	        if(req!=1){
	            list[par].add(child);
	            list[child].add(par);
	        }
	        
	    }
	    long ans=0;
	    visited=new boolean[nodes];
	    Arrays.fill(visited,false);
	    for(int i=0;i<nodes;i++){
	        if(!visited[i]){
	             ans=(ans+pow(dfs(i,-1),k)%mod)%mod;
	        }
	    }
	    System.out.println((pow(nodes,k)-ans+mod)%mod);
	    
 
	}
	static int dfs(int curr,int par){
	    visited[curr]=true;
	    int ans=1;
	    for(int it:list[curr]){
	        if(it!=par&&!visited[it]) ans+=dfs(it,curr);
	    }
	    return ans;
	}
	static long pow(long no,long pow){
    if(pow==0) return 1;
 
    long half = pow(no, pow/2);
 
    if(pow%2==0) return (half * half) % mod;
    return (half * half % mod * no) % mod;
}
}