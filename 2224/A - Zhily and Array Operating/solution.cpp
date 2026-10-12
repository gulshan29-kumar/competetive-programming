#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    long long arr[a];
	    for(int i=0;i<a;i++) cin>>arr[i];
	    long long ans=0;
	    int t=a-1;
	    for(int i=t;i>=0;i--){
	        if(arr[i]>0) ans++;
	        else if(i<t&&(arr[i]+arr[i+1])>0) ans++;
	        if(i<t) arr[i]=max(arr[i]+arr[i+1],arr[i]);
	    }
	    cout<<ans<<endl;
	}
 
}