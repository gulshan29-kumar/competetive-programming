#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	  int a;
	  cin>>a;
	  long long arr[a-1];
	  long long maxi=0;
	  for(int i=0;i<a-1;i++) {cin>>arr[i];maxi=max(maxi,arr[i]);}
	  int prev=maxi+1;
	  for(int i=0;i<a;i++){
	      if(i==0) cout<<prev<<" ";
	      else {
	          cout<<prev+arr[i-1]<<" ";
	          prev=prev+arr[i-1];
	      }
	  }
	  cout<<endl;
	}
 
}