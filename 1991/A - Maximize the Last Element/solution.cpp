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
	    int maxi=0;
	    for(int i=0;i<a;i++){
	        if(i%2==0&&(a-i-1)%2==0) maxi=max(maxi,arr[i]);
	    }
	    cout<<maxi<<endl;
	}
 
}