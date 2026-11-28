#include <bits/stdc++.h>
using namespace std;
void dfs(vector<vector<int>>& adj,vector<int>& visited,vector<int>& indegree,bool& circ,int node){
    visited[node]=1;
    if(indegree[node]==1) circ=false;
    for(auto it:adj[node]){
       if(visited[it]==0) dfs(adj,visited,indegree,circ,it); 
    }
}
int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int a;
        cin>>a;
        vector<int> arr(a+1);
        for(int i=1;i<=a;i++){
            cin>>arr[i];
        }
        set<pair<int,int>> req;
        vector<int> indegree(a+1,0);
        vector<vector<int>> adj(a+1);
        for(int i=1;i<=a;i++){
            int u=i;
            int v=arr[i];
            if(v<u) swap(v,u);
            if(req.find({u,v})==req.end()){
                indegree[u]++;
                indegree[v]++;
                adj[u].push_back(v);
                adj[v].push_back(u);
                req.insert({u,v});
            }
        }
        vector<int> visited(a+1,0);
        int circular=0;
        int singular=0;
        for(int i=1;i<=a;i++){
            if(visited[i]==0){
                bool cir=true;
                dfs(adj,visited,indegree,cir,i);
                if(cir) circular++;
                else singular++;
            }
        }
        if(singular>0) cout<<circular+1<<" "<<circular+singular<<endl;
        else cout<<circular<<" "<<circular+singular<<endl;
    }
}