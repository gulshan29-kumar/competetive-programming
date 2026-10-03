#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	  string str;
	  cin>>str;
	  int ans=1;
	  int i=0;
	  int len=str.size();
	  set<char> set1;
	  while(i<len){
	      set1.insert(str[i]);
	      if(set1.size()>3){
	          set1.clear();
	          set1.insert(str[i]);
	          ans++;
	      }
	      i++;
	  }
	  cout<<ans<<endl;
	}
 
}