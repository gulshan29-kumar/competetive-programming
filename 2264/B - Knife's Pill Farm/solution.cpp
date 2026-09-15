#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,b;
	    cin>>a>>b;
	    long long  arr[a];
	    for(int i=0;i<a;i++) cin>>arr[i];
	    priority_queue<long long> pq;
	    long long ans=-2e18;
	    long long sum=0;
	    for(int i=0;i<a;i++){
	       if(pq.size()==b-1){
	           ans=max(ans,b*arr[i]-sum);
	       }
	       sum+=arr[i];
	       pq.push(arr[i]);
	       if(pq.size()>b-1){
	           sum-=pq.top();
	           pq.pop();
	       }
	    }
	    cout<<ans<<endl;
	   
	    
	}
 
}