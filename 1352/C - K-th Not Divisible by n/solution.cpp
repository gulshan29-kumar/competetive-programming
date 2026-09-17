#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
 
	while(t--){
	  long long a,b;
	  cin>>a>>b;
	  long long req=b/(a-1);
	  if(b%(a-1)==0){
	      cout<<(req)*a-1<<endl;
	  }
	  else cout<<(req*a+b%(a-1))<<endl;
	}
 
}