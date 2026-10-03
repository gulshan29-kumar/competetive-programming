#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    long long a;
	    cin>>a;
	    int cnt=log10(a)+1;
	    int ans=a-pow(10,cnt-1);
	    cout<<ans<<endl;
	    
	    
	}
 
}