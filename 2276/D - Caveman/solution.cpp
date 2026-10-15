#include <bits/stdc++.h>
using namespace std;
bool dfs(int parent,vector<vector<int>>& adj,vector<int> visited,vector<int>& indegree){
    visited[parent]=1;
    for(auto it:adj[parent]){
        if(!visited[it]){
            if(dfs(it,adj,visited,indegree)||indegree[it]>=2) return true;
        }
    }
    return false;
}
int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int a,k;
        cin>>a>>k;
        vector<vector<int>> adj(a);
        vector<int> indegree(a,0);
        for(int i=0;i<k;i++){
            int u,v;
            cin>>u>>v;
            u--;
            v--;
            adj[u].push_back(v);
            adj[v].push_back(u);
            indegree[u]++;
            indegree[v]++;
        }
        int bool0=false;
        int bool2=false;
       for(int i=0;i<a;i++){
           if(indegree[i]==0) bool0=true;
           if(k==a-1&&indegree[i]==a-1) bool2=true;
       }
       
       if(bool0) cout<<"Brain Melt"<<endl;
       else if(bool2) cout<<2<<endl;
       else cout<<"Many"<<endl;
    }
}