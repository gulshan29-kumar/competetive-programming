#include <bits/stdc++.h>
using namespace std;
long long mod=1e9+7;
long long mp(long long a,long long b){
    if(b==1) return a;
    long long half=mp(a,b/2);
    if(b%2==0) return half*half%mod;
    return half*half%mod*a%mod;
}
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    int arr[a];
	    for(int i=0;i<a;i++) cin>>arr[i];
	    sort(arr,arr+a,greater<>());
	    long long ans=1;
	    for(int i=0;i<a;i++){
	        if(i<a-1&&arr[i]==arr[i+1]) break;
	        ans+=mp(arr[i]-1,i+1);
	        ans%=mod;
	    }
	    cout<<ans<<endl;
	}
 
}