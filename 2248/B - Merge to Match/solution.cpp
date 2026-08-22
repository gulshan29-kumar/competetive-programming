#include <bits/stdc++.h>
using namespace std;
 
bool solve(vector<int> &a, vector<int> &b, int n, int m) {
    if (n < 2 * m)
        return false;
 
    sort(a.begin(), a.end());
    sort(b.begin(), b.end());
 
    for (int i = 0; i < m; i++) {
        if (a[i] > b[i])
            return false;
    }
 
    for (int i = 0; i < m; i++) {
        if (a[n - m + i] < b[i])
            return false;
    }
 
    return true;
}
 
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
 
    int t;
    cin >> t;
 
    while (t--) {
        int n, m;
        cin >> n >> m;
 
        vector<int> a(n), b(m);
 
        for (int i = 0; i < n; i++)
            cin >> a[i];
 
        for (int i = 0; i < m; i++)
            cin >> b[i];
 
        cout << (solve(a, b, n, m) ? "YES" : "NO") << '
';
    }
 
    return 0;
}