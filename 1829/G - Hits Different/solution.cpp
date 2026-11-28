#include <bits/stdc++.h>
using namespace std;
vector<vector<long long>> sq(1500,vector<long long>(1500,0));
void func(){
  int cnt=1;
  long long no=1;
   while(no<=1000000){
       for(int i=0;i<cnt;i++){
           sq[cnt][i]=no*no;
           no++;
       }
       cnt++;
   }
}
long long dfs(int row,int idx,vector<vector<long long>>& visited){
    if(row<=0||idx<0||idx>=row) return 0;
    if(visited[row][idx]!=0) return visited[row][idx];
    long long curr=sq[row][idx];
    visited[row][idx]=1;
    curr+=dfs(row-1,idx,visited);
    curr+=dfs(row-1,idx-1,visited);
    curr-=dfs(row-2,idx-1,visited);
    return visited[row][idx]=curr;
}
int main() {
	// your code goes here
	int t;
	cin>>t;
	func();
vector<vector<long long>> visited(1500,vector<long long>(1500,0));
	while(t--){
	    int a;
	    cin>>a;
	    int row=ceil((-1+sqrt(1+8*a))/2.0);
	    int idx=-1;
	    for(int i=0;i<sq[row].size();i++){
	        if(1LL*a*a==sq[row][i]){
	            idx=i;
	            break;
	        }
	    }
	    long long ans=dfs(row,idx,visited);
	    cout<<ans<<endl;
	}
 
}