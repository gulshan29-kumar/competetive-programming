#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	 int a,b,c,d;
	 cin>>a>>b>>c>>d;
	 int sma=min(a,b);
	 int sm=max(a,b);
	 int smc=min(c,d);
	 int smd=max(c,d);
     if(sm<smc||smd<sma||(sma>smc&&sm<smd)||(sma<smc&&sm>smd)) cout<<"No"<<endl;
     else cout<<"Yes"<<endl;
	 
	}
 
}