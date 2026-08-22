#include <bits/stdc++.h>
using namespace std;
 
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
 
    int t;
    cin >> t;
 
    while (t--) {
        int n;
        cin >> n;
 
        multiset<long long> st;
        long long sum = 0;
 
        for (int i = 0; i < n; i++) {
            long long x;
            cin >> x;
            st.insert(x);
            sum += x;
        }
 
        if (sum < 1) {
            cout << -1 << "
";
            continue;
        }
 
        long long cur = 0;
        vector<long long> ans;
 
        bool ok = true;
 
        while (!st.empty()) {
            auto it = st.lower_bound(1 - cur);
 
            if (it == st.end()) {
                ok = false;
                break;
            }
 
            cur += *it;
            ans.push_back(cur);
            st.erase(it);
        }
 
        if (!ok) {
            cout << -1 << "
";
            continue;
        }
 
        for (long long x : ans)
            cout << x << " ";
        cout << "
";
    }
 
    return 0;
}