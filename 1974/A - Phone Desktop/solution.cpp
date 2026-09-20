#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,b;
	    cin>>a>>b;
	    int countmaxscreen=(b+1)/2;
	    int req=0;
	    if(b%2==0) req=a-(b/2)*7;
	    else req=a-(b+1)/2*7-4;
	    if(req>0) countmaxscreen+=(req+14)/15;
	    cout<<countmaxscreen<<endl;
	}
 
}