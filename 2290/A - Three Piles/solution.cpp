#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	   int arr[3];
	   cin>>arr[0]>>arr[1]>>arr[2];
	   sort(arr,arr+3);
	   if(arr[2]-1==arr[1]&&arr[1]==arr[0]+1) cout<<"Yes"<<endl;
	   else cout<<"No"<<endl;
	    
	    
	}
 
}