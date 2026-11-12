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
	  vector<int> arr1;
	  vector<int> arr2;
	  for(int i=0;i<a;i++) cin>>arr[i];
	  sort(arr,arr+a);
	  for(int i=0;i<a;i+=2) arr1.push_back(arr[i]);
	  for(int i=1;i<a;i+=2) arr2.push_back(arr[i]);
	  int ans=0;
	  int prev=-1;
	  for(int i=0;i<arr1.size();i++){
	      if(arr1[i]>prev) {ans++;prev=arr1[i];}
	  }
	  prev=-1;
	   for(int i=0;i<arr2.size();i++){
	      if(arr2[i]>prev) {ans++;prev=arr2[i];}
	  }
	  reverse(arr2.begin(),arr2.end());
	  cout<<ans<<endl;
	  for(auto it:arr1) cout<<it<<" ";
	  for(auto it:arr2) cout<<it<<" ";
	  cout<<endl;
	}
 
}