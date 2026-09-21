#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    int c,d,e;
	    cin>>c>>d>>e;
	    cout<<a-min(c,min(d,e))<<endl;
	}
 
}