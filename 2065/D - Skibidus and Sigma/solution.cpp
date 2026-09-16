#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,b;
	    cin>>a>>b;
	    priority_queue<pair<long long ,vector<long long>>> pq;
	    for(int i=0;i<a;i++){
	        vector<long long> ans;
	        long long sum=0;
	        for(int j=0;j<b;j++){
	            long long d;
	            cin>>d;
	            sum+=d;
	            ans.push_back(d);
	        }
	        pq.push({sum,ans});
	    }
	    long long ans=0;
	    long long sum=0;
	    while(!pq.empty()){
	        vector<long long> curr=pq.top().second;
	        for(int j=0;j<b;j++){
	            sum+=curr[j];
	            ans+=sum;
	        }
	        pq.pop();
	    }
	    cout<<ans<<endl;
	}
 
}