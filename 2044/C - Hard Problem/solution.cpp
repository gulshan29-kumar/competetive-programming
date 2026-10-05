#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	  int a,b,c,d;
	  cin>>a>>b>>c>>d;
	  int ans=0;
	  int row1=a;
	  int row2=a;
	  ans+=min(row1,b);
	  ans+=min(row2,c);
	  row1-=min(row1,b);
	  row2-=min(row2,c);
	  if(row1>0) {ans+=min(row1,d); d-=min(row1,d);}
	  if(row2>0&&d>0) ans+=min(d,row2);
	  cout<<ans<<endl;
	}
 
}