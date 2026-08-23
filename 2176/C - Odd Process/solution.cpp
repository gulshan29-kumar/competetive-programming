#include <bits/stdc++.h>
using namespace std;
 
int main() {
    int t;
    cin >> t;
 
    while (t-- > 0) {
        int a;
        cin >> a;
 
        long long arr[a];
        long long sum = 0;
 
        vector<long long> even;
        vector<long long> odd;
        vector<long long> ans(a, 0);
 
        for (int i = 0; i < a; i++) {
            cin >> arr[i];
 
            if (arr[i] % 2 == 0)
                even.push_back(arr[i]);
            else
                odd.push_back(arr[i]);
        }
 
        sort(odd.begin(), odd.end());
        sort(even.begin(), even.end());
 
        if (odd.size() == 0) {
            for (int i = 0; i < a; i++) {
                cout << 0 << " ";
            }
            cout << endl;
            continue;
        }
 
        ans[0] = odd[odd.size() - 1];
 
        int k = even.size() - 1;
        int j = 1;
 
        while (k >= 0) {
            ans[j] = ans[j - 1] + even[k];
            j++;
            k--;
        }
 
        long long rep1, rep2;
 
        rep1 = ans[j - 1];
 
        if (j - 2 >= 0)
            rep2 = ans[j - 2];
        else
            rep2 = 0;
 
        int flip = 0;
 
        for (int i = j; i < a - 1; i++) {
            if (flip++ % 2 == 0)
                ans[i] = rep2;
            else
                ans[i] = rep1;
        }
 
        if ((odd.size() - 1) % 2 == 0 && ans[a - 1] == 0) {
            if (flip++ % 2 == 0)
                ans[a - 1] = rep2;
            else
                ans[a - 1] = rep1;
        }
 
        for (int i = 0; i < a; i++)
            cout << ans[i] << " ";
 
        cout << endl;
    }
}