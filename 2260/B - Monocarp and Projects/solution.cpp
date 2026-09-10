#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    long long a,b,c;
	    cin>>a>>b>>c;
	    if(a==b){
	        cout<<0<<endl;
	        continue;
	    }
	    long long ans=0;
	    while(b>=2*a&&c--){
	        ans+=(b%a);
	        b++;
	        a++;
	    }
	    b++;
	    a++;
	    if(c>=0) ans+=(c*(b%a));
	    cout<<ans<<endl;
	}
 
}