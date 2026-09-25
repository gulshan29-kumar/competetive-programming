#include <bits/stdc++.h>
using namespace std;
 
int main() {
 
    int t;
    cin >> t;
    while (t--) {
        int a;
        cin >> a;
        
        int right_len = a / 2;
        int left_len = a - right_len;
        vector<int> left(left_len);
        vector<int> right(right_len);
        
        int j = 0;
        int k = 0;
        for (int i = 0; i < a; i++) {
            int d;
            cin >> d;
            if (i % 2 == 0) left[j++] = d;
            else right[k++] = d; // Fix 1: Was mistakenly i++
        }
        if (a <= 2) {
            cout << "YES
";
            continue;
        }
        
        sort(left.begin(), left.end());
        sort(right.begin(), right.end());
        int l = left_len - 1; 
        int r = right_len - 1;
        
        vector<pair<int,int>> le;
        vector<pair<int,int>> re;
        if (left[l] > right[r]) {
            le.push_back({left[l], 1});
            re.push_back({left[l], 1});
            l--;
        } else {
            le.push_back({right[r], 0});
            re.push_back({right[r], 0});
            r--;
        }
        
        bool poss = true;
        while (l >= 0 || r >= 0) {
            int val = -1;
            int p = -1;
            if (l >= 0 && r >= 0) {
                if (left[l] > right[r]) {
                    val = left[l]; p = 1; l--;
                } else {
                    val = right[r]; p = 0; r--;
                }
            } else if (l >= 0) {
                val = left[l]; p = 1; l--;
            } else {
                val = right[r]; p = 0; r--;
            }
            if (le.back().second != p) {
                le.push_back({val, p});
            } else if (re.back().second != p) {
                re.push_back({val, p});
            } else {
                poss = false;
                break;
            }
        }
        
        if (poss) cout << "YES
";
        else cout << "NO
";
    }
}