#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    long long  arr[a];
	    for(int i=0;i<a;i++) cin>>arr[i];
	    long long ans=0;
	    long long sum=0;
	    int i=0;
	    while(i<a&&arr[i]==0) i++;
	    
	    while(i<a){
	        bool b=false;
	        while(i<a&&arr[i]<=0) {b=true;sum+=abs(arr[i]);i++;}
	        if(b) ans++;
	        while(i<a&&arr[i]>=0) {sum+=arr[i];i++;}
	    }
	    cout<<sum<<" "<<ans<<endl;
	}
 
}