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
	    int idx=0;
	    for(int i=0;i<a;i++) {
	        cin>>arr[i];
	        if(arr[idx]<arr[i]) idx=i;
	    }
	    swap(arr[0],arr[idx]);
	    for(int i=0;i<a;i++){
	        cout<<arr[i]<<" ";
	    }
	    cout<<endl;
	}
 
}