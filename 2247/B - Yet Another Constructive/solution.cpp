#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	  long long  a,b,c;
	  cin>>a>>b>>c;
	  if(b>c){
	      cout<<"No"<<endl;
	      continue;
	  }
	  cout<<"Yes"<<endl;
	  for(int i=1;i<=a;i++){
	      if(i%b==0) cout<<c-b+1<<" ";
	      else cout<<1<<" ";
	  }
	  cout<<endl;
	 
	}
 
}