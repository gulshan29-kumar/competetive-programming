#include <bits/stdc++.h>
using namespace std;
 
int main() {
    int t;
    cin >> t;
 
    while(t--) {
        string str1, str2;
        cin >> str1 >> str2;
 
        char a = str1.back();
        char b = str2.back();
 
        int len = str1.size();
        int len2 = str2.size();
 
        if(a != b) {
            if(a == 'S' || b == 'L')
                cout << "<
";
            else
                cout << ">
";
        }
        else if(a == 'M') {
            cout << "=
";
        }
        else if(a == 'S') {
            if(len == len2) cout << "=
";
            else if(len > len2) cout << "<
";
            else cout << ">
";
        }
        else {
            if(len == len2) cout << "=
";
            else if(len > len2) cout << ">
";
            else cout << "<
";
        }
    }
}