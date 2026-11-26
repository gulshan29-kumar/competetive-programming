#include<bits/stdc++.h>
using namespace std;
#define N 2020
int T,n,q,a[N],ans[N];
int main()
{
	scanf("%d",&T);
	while(T--){
		scanf("%d%d",&n,&q);
		for(int i=1;i<=n;i++)scanf("%d",&a[i]);
		sort(a+1,a+n+1);
		ans[0]=a[n]-a[1];
		int m=0;
		while(ans[m]){
			vector<int>d;
			for(int i=1;i<=n;i++)for(int j=i+1;j<=n;j++)d.push_back(a[i]^a[j]);
			sort(d.begin(),d.end());
			for(int i=1;i<=n;i++)a[i]=d[i-1];
			ans[++m]=a[n]-a[1];
		}
		while(q--){
			int x;
			scanf("%d",&x);
			printf("%d
",x>m?0:ans[x]);
		}
	}
}