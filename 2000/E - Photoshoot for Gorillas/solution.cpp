#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int len,wid,sid;
	    cin>>len>>wid>>sid;
	    int a;
	    cin>>a;
	    long long arr[a];
	    for(int i=0;i<a;i++){
	        cin>>arr[i];
	    }
	    sort(arr,arr+a,greater());
	    vector<long long> ans;
	    for(int i=1;i<=len;i++){
	        for(int j=1;j<=wid;j++){
	            long long cnt=min(min(sid,len-sid+1),min(i,len-i+1))*min(min(sid,wid-sid+1),min(j,wid-j+1));
	            ans.push_back(cnt);
	        }
	    }
	    sort(ans.begin(),ans.end(),greater());
	    long long ans1=0;
	    for(int i=0;i<a;i++){
	        ans1+=ans[i]*arr[i];
	    }
	    cout<<ans1<<endl;
	}
 
}