#include <bits/stdc++.h>
using namespace std;
 
int main() {
    int t;
    cin>>t;
 
    while(t-- > 0) {
      int a, b;
      cin>>a>> b;
      vector<long long> arr(a);
      for(int i = 0; i<a;i++) cin>>arr[i];
      int reqi=b - 1;
      int reqj =a - b;
      long long sum = 0;
        int cnt = 0;
        if (reqi <= reqj) {
            for(int i = reqi; i <= reqj; i++) {
                sum += arr[i];
                cnt++;
            }
            reqi--;
            reqj++;
        } else {
            reqi = a - b;
            reqj = b - 1;
        }
 
        while(cnt < a - b + 1 && reqi >= 0 && reqj < a) {
            sum += max(arr[reqi], arr[reqj]);
            reqi--;
            reqj++;
            cnt++;
        }
        cout << sum << "
";
    }
    
    return 0;
}