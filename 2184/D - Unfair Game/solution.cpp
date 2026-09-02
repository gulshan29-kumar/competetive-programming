#include <bits/stdc++.h>
using namespace std;
long long comb(long long n, long long r) {
    if (r > n - r) r = n - r;
    long long ans = 1;
 
    for (long long i = 1; i <= r; i++) {
        ans = ans * (n - i + 1) / i;
    }
 
    return ans;
}
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	    long long bob,moves;
	    cin>>bob>>moves;
	    long long req=moves+1;
	    long long  cnt=log2(bob);
 
	    long long ans=cnt+1>moves?1:0;
	    for(int i=0;i<cnt;i++){
	        long long spaces=i;
	        long long req=max(0LL,moves-spaces);
	        for(int j=req;j<=spaces;j++){
	            ans+=comb(spaces,j);
	        }
	    }
	    cout<<ans<<endl;
	    
	}
 
}