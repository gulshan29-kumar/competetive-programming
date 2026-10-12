#include <bits/stdc++.h>
using namespace std;
int main() {
	int t;
	cin >> t;
	while (t--) {
		int n;
		cin >> n;
		vector<int>a(n);
		map<int, int>mp;
		for (int& i : a)cin >> i, mp[i]++;
		sort(a.rbegin(), a.rend());
		long long ans = 0,mex=0;
		while (n--) {
			if (mex == a[0])mex++;
			ans += mex + a[0];
			if (mp[mex])mex++;
		}
		cout << ans << endl;
	}
}