#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
ll N,M,K,A[300001],mx,idx;
 
ll calc() {
	mx=-1,idx=-1;
	for(int i=0;i<N-1;i++) if(abs(A[i]-A[i+1])>mx) mx=abs(A[i]-A[i+1]),idx=i;
	vector<ll> suf(N,0);
	for(int i=N-2;i>=0;i--) suf[i]=max(suf[i+1],abs(A[i]-A[i+1]));
	ll leftMax=0;	for(int i=0;i<idx;i++) leftMax=max(leftMax,abs(A[i]-A[i+1]));
	ll ans=mx,tmp=0;
	for(int i=idx+1;i<N;i++) {
		if(i>idx+1) tmp=max(tmp,2*abs(A[i]-A[i-1]));
		ll tt=max({leftMax,tmp,abs(A[i]*2-A[idx])});
		if(i!=N-1) tt=max({tt,abs(A[idx+1]*2-A[i+1]),suf[i+1]});
		ans=min(ans,tt);
	}
	return ans;
}
 
int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
	int T;
	cin>>T;
	while(T--) {
		cin>>N;
		for(int i=0;i<N;i++) cin>>A[i];
		ll r1=calc();
		reverse(A,A+N);
		ll r2=calc();
		cout<<min(r1,r2)<<'
';
	}
}