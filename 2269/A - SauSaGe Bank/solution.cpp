#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	    int a,b;
	    cin>>a>>b;
	    int diff=b-1;
	    int ans=diff*2;
	    ans=ans+(1<<(a-diff));
	    cout<<ans<<endl;
	}
 
}