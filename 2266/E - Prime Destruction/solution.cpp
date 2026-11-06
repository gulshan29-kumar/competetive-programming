#include<bits/stdc++.h>
using namespace std;
using ll=long long;
using vi=basic_string<int>;
const ll N=200000;
int i,j,k,n,m,t,f[N+50];
ll res;
bitset<N+50> b;
vi p[N+50];
int main(){
	ios::sync_with_stdio(0);cin.tie(0);
	for(i=2;i<=N;i++)
	    if(!b[i]){for(j=i;j<=N;j+=i){b[j]=1;p[j]+=i;}}
	cin>>t;
	while(t--){
		cin>>n>>m;
		for(i=1;i<=n;i++){
			f[i]=1e9;
			if(i<=m)f[i]=0;
			else for(auto j:p[i])f[i]=min(f[i],1+j*f[i/j]);
		}
		res=0;
		for(i=1;i<=n;i++){cin>>k;res+=f[k];}
		cout<<res<<'
';
	}
}