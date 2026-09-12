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
	  bool b=true;
	  int cnt2=a;
	  while(b&&cnt2--){
	      int i=0;
	      int j=1;
	      int cnt=0;
	      for(int k=i;k<a;){
	          while(k<a&&str[k]=='*') k++;
	          j=k+1;
	          while(j<a&&str[j]=='*') j++;
	          if(j<a&&str[k]==str[j]) {
	             str[k]='*';
	             str[j]='*';
	             k=j+1;
	             cnt++;
	          }
	          else k=j;
	          if(k>=a) break;
	      }
	      if(cnt==0) b=false;
	  }
	  b=true;
	  for(int i=0;i<a;i++){
	      if(str[i]!='*') {
	          b=false;
	          break;
	      }
	  }
	  if(b) cout<<"Yes"<<endl;
	  else cout<<"No"<<endl;
	}
 
}