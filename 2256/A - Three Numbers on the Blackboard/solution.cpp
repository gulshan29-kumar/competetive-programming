#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	    int a,b,c;
	    cin>>a>>b>>c;
	    if(c<b) swap(b,c);
	    if(c<a) swap(a,c);
	    if(a+b>c) cout<<c-min(a,b)<<endl;
	    else cout<<max(a,b)<<endl;
	}
 
}