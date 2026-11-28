#include <bits/stdc++.h>
using namespace std;
 
// Time Complexity : O(n)
// Memory Complexity: O(1)
 
using ll = long long;
 
const ll MOD = 998244353;
ll add(ll a, ll b, ll m = MOD) { return ((a%m) + (b%m) + m) % m; }
ll sub(ll a, ll b, ll m = MOD) { return ((a%m) - (b%m) + m) % m; }
ll mul(ll a, ll b, ll m = MOD) { return ((a%m) * (b%m)) % m; }
ll modexp(ll a, ll e, ll m = MOD) {
    a %= m; ll r = 1;
    while (e) {
        if (e & 1) r = mul(r, a, m);
        a = mul(a, a, m);
        e >>= 1;
    }
    return r;
}
ll inv(ll a, ll m = MOD) { return modexp(a, m - 2, m); }
 
int main() {
	ios_base::sync_with_stdio(false); cin.tie(0);
 
	int n; cin >> n;
	 long long ans=1;
    for(int i=0;i<n;i+=3){
    vector<int> arr(3);
    cin>>arr[0]>>arr[1]>>arr[2];
    sort(arr.begin(),arr.end());
    if(arr[0]==arr[2]) ans=mul(ans,3);
    else if(arr[0]==arr[1]) ans=mul(ans,2);
    }
    int cnt=1;
    for(int i=n/3;i>n/3-n/6;i--){
        ans=mul(ans,i);
        ans=mul(ans,inv(cnt++));
    }
    cout<<ans<<endl;
	return 0;
}