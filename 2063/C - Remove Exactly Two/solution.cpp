#include <bits/stdc++.h>
using namespace std;
         
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	   vector<vector<int>> adj(a);
	   vector<int> degree(a);
	   for(int i=0;i<a-1;i++){
	       int u,v;
	       cin>>u>>v;
	       adj[u-1].push_back(v-1);
	       adj[v-1].push_back(u-1);
	       degree[u-1]++;
	       degree[v-1]++;
	   }
	   int ans=0;
	   vector<pair<int,int>> order;
	   for(int i=0;i<a;i++){
	       order.push_back({degree[i],i});
	   }
	   sort(order.begin(), order.end(), greater<pair<int,int>>());
	   vector<int> mark(a, -1);
	   for(int u=0;u<a;u++){
	       for(auto it:adj[u]){
	              mark[it]=u;
	           }
	       for(int v=0;v<a;v++){
	           int node=order[v].second;
	           if(node==u) continue;
	           if(mark[node]==u){
	               ans=max(ans,degree[u]+degree[node]-2);
	           }
	           else{
	               ans=max(ans,degree[u]+degree[node]-1);
	               break;
	           }
	       }
	   }
	   cout<<ans<<endl;
	   
	}
 
}