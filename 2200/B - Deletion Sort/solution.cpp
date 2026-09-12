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
	  for(int i=0;i<a;i++){
	      cin>>arr[i];
	      if(i>0&&arr[i]<arr[i-1]) b=false;
	  }
	  if(!b) cout<<1<<endl;
	  else cout<<a<<endl;
	}
 
}