#include <bits/stdc++.h>
using namespace std;
 
int main() {
    int t;
    cin >> t;
 
    while(t--) {
        int a, b;
        cin >> a >> b;
 
        set<char> s;
 
        for(int i = 0; i < a; i++) {
            string str;
            cin >> str;
            s.insert(str[0]);
        }
 
        bool b1 = true;
 
        for(int i = 0; i < b; i++) {
            string str;
            cin >> str;
 
            if(!b1) continue;
 
            for(char c : str) {
                if(s.find(tolower(c)) == s.end()) {
                    b1 = false;
                    break;
                }
            }
        }
 
        cout << (b1 ? "yes" : "no") << endl;
    }
}