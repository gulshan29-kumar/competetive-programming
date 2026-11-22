#include<bits/stdc++.h> 
using namespace std;
int t,n,a[200001],vis[200001],ans[200001];
void solve()
{
	cin>>n;
	for(int i=1;i<=n;i++) cin>>a[i],vis[i]=0;
	for(int i=1;i<=n;i++)
	{
		if(a[i]+n-i+1>n||a[i]+n-i+1<1||vis[a[i]+n-i+1]) return cout<<-1<<'
',void();
		else ans[a[i]+n-i+1]=i,vis[a[i]+n-i+1]=1;
	}
	for(int i=1;i<=n;i++) cout<<ans[i]<<' ';
	cout<<'
';
}
int main()
{
	cin>>t;
	while(t--) solve();
}