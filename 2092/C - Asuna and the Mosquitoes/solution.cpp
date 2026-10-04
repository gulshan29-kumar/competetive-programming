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
    bool odd=false;
    bool even=false;
    long long maxi=0;
    int cnt0=0;
    long long sum=0;
    for(int i=0;i<a;i++){
        if(arr[i]%2==0) even=true;
        if(arr[i]%2==1) odd=true;
        if(arr[i]%2==1) cnt0++;
        maxi=max(arr[i],maxi);
        sum+=arr[i];
    }
    if(even&&odd) cout<<sum-(cnt0-1)<<endl;
    else cout<<maxi<<endl;
	}
 
}