#include <bits/stdc++.h>
using namespace std;
using ll=long long int;
int main() {
int t ;cin>>t;
while(t--)
{
ll low=0,high=0,ans=LLONG_MIN;
ll n;cin>>n;
ll a[n];
for(auto&x:a)
{
    cin>>x;
    ans=max({ans,x-low,x+high});
high=max(x,x+2*high);
low=min(x,x+2*low);
}
cout<<ans<<endl;
}
 
}