#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    long long a,b;
	    cin>>a>>b;
	    long long ans=a+b;
	    for(int i=30;i>=0;i--){
	        if(ans&(1<<i)&&a>=(1<<i)){
	            a-=(1<<i);
	        }
	    }
	    cout<<ans<<" "<<a<<endl;
	}
 
}