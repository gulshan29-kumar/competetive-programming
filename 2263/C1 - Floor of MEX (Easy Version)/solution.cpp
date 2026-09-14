#include <bits/stdc++.h>
using namespace std;
 
int main() {
    int t;
    cin >> t;
 
    while (t--) {
        int a;
        cin >> a;
 
        vector<long long> nottake(a + 2, 0);
        vector<long long> arr(a);
 
        for (int i = 0; i < a; i++) cin >> arr[i];
 
        set<long long> st;
 
        for (int i = 0; i < a; i++) {
            long long start = arr[i] * (i + 1);
            long long end = (arr[i] + 1) * (i + 1);
 
            if (start <= a) {
                nottake[start]++;
                nottake[min((long long)a + 1, end)]--;
            }
        }
 
        for (int i = 1; i <= a + 1; i++)
            nottake[i] += nottake[i - 1];
 
        for (int i = 0; i < a; i++) {
            for (long long j = 0; j <= arr[i] - 1; j++) {
                long long start = (i + 1) * j;
                long long end = (i + 1) * (j + 1);
 
                if (start > a)
                    continue;
 
                if (nottake[start]) {
                    for (long long k = start + 1; k <= min((long long)a + 1, end); k++) {
                        if (!nottake[k]) {
                            if (k <= a)
                                st.insert(k);
                            break;
                        }
                    }
                } else {
                    st.insert(start);
                }
            }
        }
 
        cout << st.size() << '
';
 
        for (auto it : st)
            cout << it << " ";
 
        cout << '
';
    }
}