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
        int prev=INT_MAX;
	    for(int i=0;i<a;i++) {
	        cin>>arr[i];
	        if(i+1!=arr[i]){
	            if(prev<arr[i]) {
	                b=false;
	            }
	            else prev=arr[i];
	            
	            
	        }
	    }
	    if(b) cout<<"Yes"<<endl;
	    else cout<<"No"<<endl;
	   
	    
	}
 
}