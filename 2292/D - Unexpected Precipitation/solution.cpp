#include <bits/stdc++.h>
using namespace std;
long long func(vector<long long>& arr1,vector<long long>&  arr2,int idx,int state,    vector<vector<long long>>& dp){
    if(idx==arr1.size()) return 0;
    if(dp[idx][state]!=LLONG_MAX) return dp[idx][state];
    if(state==0){
        long long  take=arr1[idx]-arr2[idx]+func(arr1,arr2,idx+1,0,dp);
        long long nottake=func(arr1,arr2,idx+1,1,dp);
        return dp[idx][state]=max(take,nottake);
    }
    else {
        long long take=arr2[idx]-arr1[idx]+func(arr1,arr2,idx+1,1,dp);
        long long nottake=func(arr1,arr2,idx+1,0,dp);
        return dp[idx][state]=min(take,nottake);
    }
}
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    vector<long long> arr1(a);
	    vector<long long> arr2(a);
	    vector<vector<long long>> dp(a,vector<long long> (2,LLONG_MAX));
	    for(int i=0;i<a;i++) cin>>arr1[i];
	    for(int i=0;i<a;i++) cin>>arr2[i];
	    long long ans=func(arr1,arr2,0,0,dp);
	    if(ans==0) cout<<"Draw"<<endl;
	    else if(ans>0) cout<<"Sunny"<<endl;
	    else cout<<"Aubrey"<<endl;
	    
	}
 
}