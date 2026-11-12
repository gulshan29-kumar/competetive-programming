#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	  int a;
	  string str;
	  cin>>a>>str;
	  char ch='R';
	  int ans=0;
	  for(int i=0;i<a;i++){
	      if(str[i]!=ch){
	          ans++;
	          continue;
	      }
	      if(ch=='R') ch='B';
	      else ch='R';
	  }
	    
	   cout<<ans<<endl;
	}
 
}