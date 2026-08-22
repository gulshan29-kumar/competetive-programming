#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int n,x,y,k;
	    cin>>n>>x>>y>>k;
	    if(n<=3){
	        cout<<1<<endl;
	        continue;
	    }
	    int diff=abs(y-x);
	    int diff2=n-diff;
	    cout<<k+min(diff,diff2)<<endl;
 
	}
 
}