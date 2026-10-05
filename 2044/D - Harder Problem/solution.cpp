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
	  vector<int> b(a+1,0);
	  for(int i=0;i<a;i++) cin>>arr[i];
	  set<int> set;
	  vector<int> no;
	  int maxi=0;
	  for(int i=0;i<a;i++){
	      if(set.find(arr[i])!=set.end()) continue;
	      b[arr[i]]=1;
	      set.insert(arr[i]);
	      no.push_back(arr[i]);
	      maxi=max(maxi,arr[i]);
	  }
	  int i=0;
	  for(int j=i;j<no.size();j++) {cout<<no[j]<<" ";i++;}
      for(int i=1;i<=a;i++) if(b[i]==0) cout<<i<<" ";
	  cout<<endl;
	}
 
}