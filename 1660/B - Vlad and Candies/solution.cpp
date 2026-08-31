#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	    int a;
	    cin>>a;
	    int arr[a];
	    for(int i=0;i<a;i++) {
	        cin>>arr[i];
	    }
	    sort(arr,arr+a);
	    if(a==1&&arr[0]>1) cout<<"No"<<endl;
	    else if(a>1&&arr[a-1]-arr[a-2]>=2){
	        cout<<"No"<<endl;
	    }
	    else cout<<"Yes"<<endl;
	  
	}
 
}