#include <bits/stdc++.h>
using namespace std;
long long  mod=998244353;
 
long long  pos(long long  no){
    if(no==0) return 1;
    long long half=pos(no/2);
    if(no%2==0) return half*half%mod;
    return ((half*half)%mod*2)%mod;
}
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	   long long a,b,c,d;
	   cin>>a>>b>>c>>d;
	   long long ans=a*b-(a-c+1)*(b-d+1);
	   long long  ans1=pos(ans)%mod;
	   cout<<ans1<<endl;
	    
	}
 
}