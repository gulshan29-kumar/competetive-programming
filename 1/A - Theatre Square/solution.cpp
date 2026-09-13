#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	long long  a,b,c;
	cin>>a>>b>>c;
	long long ans=((a+c-1)/c)*((b+c-1)/c);
	cout<<ans<<endl;
 
}