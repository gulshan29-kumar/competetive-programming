#include <bits/stdc++.h>
using namespace std;
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	  int a;
	  cin>>a;
	  int  arr[a];
	  for(int i=0;i<a;i++){
	      cin>>arr[i];
	  }
	  vector<int> maxi(a);
	  maxi[0]=arr[0];
	  vector<int> mini(a);
	  mini[a-1]=arr[a-1];
	  for(int i=1;i<a;i++) maxi[i]=max(maxi[i-1],arr[i]);
	  for(int i=a-2;i>=0;i--) mini[i]=min(mini[i+1],arr[i]);
	  vector<int> ans(a);
	  ans[a-1]=maxi[a-1];
	  for(int i=a-2;i>=0;i--){
	      if(maxi[i]>mini[i+1]) ans[i]=ans[i+1];
	      else ans[i]=maxi[i];
	  }
	  
	  for(auto it:ans) cout<<it<<" ";
	  cout<<endl;
	}
 
}