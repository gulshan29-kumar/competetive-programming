#include<bits/stdc++.h>
using namespace std;
long long pl[200001],pr[200001],ps[1000001];
int n;
long long f(long long x,long long y)
{
	int px=lower_bound(pr+1,pr+n+1,x)-pr,py=upper_bound(pl+1,pl+n+1,y)-pl-1;
	return px>py?0ll:ps[py]-ps[px-1]-max(x-pl[px],0ll)-max(pr[py]-y,0ll);
}
int main()
{
	ios::sync_with_stdio(false);
	cin.tie(nullptr);
	long long tmp,mx,x,l,r,mid;
	int t,m,k,i;
	cin>>t;
	while(t--)
	{
		cin>>n>>m>>k;mx=-1,x=0;
		for(i=1;i<=n;i++)
		cin>>pl[i]>>pr[i],ps[i]=ps[i-1]+(pr[i]-pl[i]+1);
		for(i=1;i<=n;i++)
		if((tmp=f(pl[i],pl[i]+m-1))>mx)
		mx=tmp,x=pl[i];
		if(k>mx)
		{
			printf("-1
");
			continue;
		}
		if(k==mx)
		{
			printf("%lld
",x);
			continue;
		}
		l=x,r=1e18;
		while(l<=r)
		{
			mid=(l+r)/2;
			f(mid,mid+m-1)>k?l=mid+1:r=mid-1;
		}
		printf("%lld
",l);
	}
	return 0;
}