#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
 
	while(t--){
	  long long a,b;
	  cin>>a>>b;
	  if(b>a){
	      cout<<"No"<<endl;
	      continue;
	  }
	  if(a-(b-1)*2>0&&(a-(b-1)*2)%2==0){
	      cout<<"Yes"<<endl;
	      for(int i=0;i<b;i++){
	          if(i<b-1) cout<<2<<" ";
	          else cout<<a-(b-1)*2<<endl;
	      }
	  }
	  else if(a-(b-1)>0&&(a-(b-1))%2==1){
	      cout<<"Yes"<<endl;
	      for(int i=0;i<b;i++){
	          if(i<b-1) cout<<1<<" ";
	          else cout<<a-(b-1)<<endl;
	      }
	  }
	  else cout<<"No"<<endl;
	}
 
}