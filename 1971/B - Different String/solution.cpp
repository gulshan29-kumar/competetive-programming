#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	  string str;
	  cin>>str;
	  int i=0;
	  int j=str.size()-1;
	  while(i<j){
	      if(str[i]==str[j]){
	          j--;
	          continue;
	      }
	      swap(str[i],str[j]);
	      break;
	  }
	  if(i==j) cout<<"No"<<endl;
	  else{
	      cout<<"Yes"<<endl;
	      cout<<str<<endl;
	  }
	}
 
}