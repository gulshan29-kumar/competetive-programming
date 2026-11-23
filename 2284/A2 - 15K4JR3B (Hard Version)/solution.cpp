#include<bits/stdc++.h>
using namespace std;
int a[110];
int main()
{
	int t,n;
	cin>>t;
	while(t--)
	{
		cin>>n;
		for(int i=1;i<=n;i++) cin>>a[i];
		sort(a+1,a+n+1);
		long long x1=0,x2=0;
		for(int i=n;i>=1;i--)
		{
			if(x1<=x2) x1+=(1<<a[i]);
			else x2+=(1<<a[i]);
		}
		cout<<x1*x2<<'
';
	}
	return 0;
}