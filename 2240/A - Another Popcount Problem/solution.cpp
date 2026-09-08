#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,b;
	    cin>>a>>b;
	    int ans=0;
	    int cnt=1;
	    while(a>b*cnt){
	        ans+=b;
	        a=a-b*(cnt);
	        cnt=cnt<<1;
	    }
	    ans+=(a/cnt);
	    cout<<ans<<endl;
	    
	}
 
}