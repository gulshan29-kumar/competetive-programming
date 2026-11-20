#include<bits/stdc++.h>
using namespace std;
int a[200001],b[200001];
int main(){
	ios::sync_with_stdio(0),cin.tie(0);
	int t,n,ans,tmp,mx,i;
	cin>>t;
	while(t--){
		cin>>n;ans=tmp=0;
		for(i=1;i<=n;i++)cin>>a[i];
		for(i=1;i<=n;i++)cin>>b[i];
		for(i=1;i<=n-1;i++)ans+=a[i+1]==b[i]?2:1;
		ans+=a[n]==b[n]?2:1;
		for(i=1;i<=n-1;i++)tmp+=a[i]==b[i+1]?2:1;
		mx=tmp;
		for(i=1;i<=n-1;i++){
			tmp=tmp-(a[i]==b[i+1]?2:1)+(a[i]==b[i]?2:1);
			mx=max(mx,tmp);
		}
		cout<<ans+mx<<'
';
	}
	return 0;
}