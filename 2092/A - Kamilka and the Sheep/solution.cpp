#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	int a;
	cin>>a;
	int arr[a];
	for(int i=0;i<a;i++) cin>>arr[i];
	int maxi=INT_MIN;
	int mini=INT_MAX;
	for(int i=0;i<a;i++){
	    maxi=max(maxi,arr[i]);
	    mini=min(mini,arr[i]);
	}
	cout<<maxi-mini<<endl;
	}
 
}