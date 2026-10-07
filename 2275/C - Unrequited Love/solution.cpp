#include <bits/stdc++.h>
using namespace std;
//q3
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    long long arr[a];
	    for(int i=0;i<a;i++) cin>>arr[i];
	    map<long long ,pair<vector<int>,vector<int>>> mp;
	    long long ans=0;
	    for(int i=0;i<a-4;i++){
	        long long sum=arr[i]+arr[i+2]-arr[i+4];
	        if(i%2==0){
	            if(mp.find(sum)!=mp.end()){
	                ans+=mp[sum].second.size();
	                mp[sum].first.push_back(i+4);
	                int idx=lower_bound(mp[sum].first.begin(),mp[sum].first.end(),i)-mp[sum].first.begin();
	                ans+=idx;
	            }
	            else {
	               mp[sum]={{i+4},{}};
	            }
	        }
	        else{
	           if(mp.find(sum)!=mp.end()){
	                ans+=mp[sum].first.size();
	                mp[sum].second.push_back(i+4);
	                int idx=lower_bound(mp[sum].second.begin(),mp[sum].second.end(),i)-mp[sum].second.begin();
	                ans+=idx;
	            }
	            else {
	               mp[sum]={{},{i+4}};
	            }
	        }
	    }
	    cout<<ans<<endl;
	}
 
}