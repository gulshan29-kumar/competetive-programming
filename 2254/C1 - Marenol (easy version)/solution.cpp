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
 
        string a, b;
        cin >> a >> b;
 
        int odd1 = 0, even1 = 0;
        int odd2 = 0, even2 = 0;
 
        for (int i = 0; i < n; i++) {
            if (a[i] == '1') {
                if ((i + 1) % 2)
                    odd1++;
                else
                    even1++;
            }
 
            if (b[i] == '1') {
                if ((i + 1) % 2)
                    odd2++;
                else
                    even2++;
            }
        }
 
        if (odd1 == odd2 && even1 == even2)
            cout << "YES
";
        else
            cout << "NO
";
    }
 
    return 0;
}