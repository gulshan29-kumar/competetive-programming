#include <bits/stdc++.h>
using namespace std;
 
int main() {
    int t;
    cin >> t;
 
    while (t--) {
        string s;
        cin >> s;
 
        bool oneRemoved = false;
        bool zeroRemoved = false;
 
        for (int i = 0; i < s.length(); i++) {
            if (s[i] == '1' && !oneRemoved) {
                oneRemoved = true;
                continue;
            }
 
            if (s[i] == '0' && !zeroRemoved) {
                zeroRemoved = true;
                continue;
            }
 
            cout << s[i];
        }
 
        cout << endl;
    }
 
    return 0;
}