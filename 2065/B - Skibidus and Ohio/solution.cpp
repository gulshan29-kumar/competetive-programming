#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	   string str;
	   cin>>str;
	   bool b=false;
	   for(int i=1;i<=str.size();i++){
	       if(str[i]==str[i-1]){
	           b=true;
	           break;
	       }
	   }
	   if(b) cout<<1<<endl;
	   else cout<<str.size()<<endl;
	}
}