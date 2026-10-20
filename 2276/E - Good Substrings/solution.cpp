#include <bits/stdc++.h>
using namespace std;
using ll =long long;
int main()
{
	ios::sync_with_stdio(false);
	cin.tie(nullptr);
	int T;
	cin>>T;
	while(T--){
	ll n;
	string s;
	cin>>n>>s;
	ll id2=0,id20=0,id202=0,id25=0,id26=0;
	vector<ll>da(n+3,0),db(n+3,0);
	for(int i=1;i<=n;i++){
		char c=s[i-1];
		if(c=='2'){
			id202=max(id202,id20);
			id2=i;
		}else if(c=='0'){
			id20=max(id20,id2);
		}else if(c=='5'){
			id25=max(id25,id202);
		}else if(c=='6'){
			id26=max(id26,id202);
		}
		ll l=id26+1;
		ll r=id25;
		if(l<=r){
			da[l]+=1;
			da[r+1]-=1;
			ll c=1-l;
			db[l]+=c;
			db[r+1]-=c;
			if(r+1<=i){
				ll pc=r-l+1;
				db[r+1]+=pc;
				db[i+1]-=pc;
			}
		}
	}
	ll ca=0,cb=0;
	for(int i=1;i<=n;i++){
		ca+=da[i];
		cb+=db[i];
		ll y=ca*i+cb;
		ll z=(ll)i*(n-i+1);
		ll ans=z-y;
		if(i>1)cout<<' ';
		cout<<ans;
	}
	cout<<'
';
	}
	return 0;
}