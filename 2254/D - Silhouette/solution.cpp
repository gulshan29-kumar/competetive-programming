#include <bits/stdc++.h>
using namespace std;
 
using int64 = long long;
 
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
 
    int T;
    cin >> T;
 
    while (T--) {
        int n;
        cin >> n;
 
        vector<int64> b(n);
        map<int64, int> freq;
 
        for (int i = 0; i < n; i++) {
            cin >> b[i];
            freq[b[i]]++;
        }
 
        vector<pair<int64, int>> groups;
        for (auto x : freq)
            groups.push_back(x);
 
        map<int64, int64> value;
        bool ok = true;
 
        if (groups.size() == 1) {
            value[groups[0].first] = 1;
        } else {
            int64 prevValue = 0;
 
            for (int i = 0; i + 1 < (int)groups.size(); i++) {
                int64 cur = groups[i].first;
                int64 nxt = groups[i + 1].first;
                int64 f = groups[i].second;
 
                int64 diff = nxt - cur;
 
                if (diff <= 0 || diff % f != 0) {
                    ok = false;
                    break;
                }
 
                int64 v = diff / f;
 
                if (v <= prevValue) {
                    ok = false;
                    break;
                }
 
                value[cur] = v;
                prevValue = v;
            }
 
            if (ok) {
                value[groups.back().first] = prevValue + 1;
            }
        }
 
        if (!ok) {
            cout << -1 << '
';
            continue;
        }
 
        vector<int64> a(n);
        for (int i = 0; i < n; i++)
            a[i] = value[b[i]];
 
        // Verify by recomputing shadows
        vector<int64> sorted = a;
        sort(sorted.begin(), sorted.end());
 
        map<int64, int64> shadow;
        int64 pref = 0;
        int i = 0;
 
        while (i < n) {
            int j = i;
            while (j < n && sorted[j] == sorted[i])
                j++;
 
            shadow[sorted[i]] = pref;
 
            for (int k = i; k < j; k++)
                pref += sorted[k];
 
            i = j;
        }
 
        for (int i = 0; i < n; i++) {
            if (shadow[a[i]] != b[i]) {
                ok = false;
                break;
            }
        }
 
        if (!ok) {
            cout << -1 << '
';
            continue;
        }
 
        for (int64 x : a)
            cout << x << " ";
        cout << '
';
    }
 
    return 0;
}