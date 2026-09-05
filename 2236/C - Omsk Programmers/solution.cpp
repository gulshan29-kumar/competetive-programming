#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    long long a,b,x;
	    cin>>a>>b>>x;
	    long long ans=abs(b-a);
	    int cnt=0;
	    while(a!=0||b!=0){
	        cnt++;
	        if(a>b) a=a/x;
	        else b=b/x;
	        ans=min(ans,abs(a-b)+cnt);
	    }
	    cout<<ans<<endl;
	}
 
}