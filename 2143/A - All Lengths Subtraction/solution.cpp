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
	     bool b=true;
	     for(int i=0;i<a;i++) cin>>arr[i];
	    for(int i=1;i<a-1;i++){
	        if(arr[i-1]>arr[i]&&arr[i+1]>arr[i]) b=false;
	    }
	    if(b) cout<<"yes"<<endl;
	    else cout<<"no"<<endl;
	}
 
}