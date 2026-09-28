#include <bits/stdc++.h>
using namespace std;
 
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
 
    int t;
    cin >> t;
 
    while(t--) {
        int a;
        cin >> a;
 
        map<int,int> map1;
        vector<int> temp;
 
        long long sum1 = 0;
        long long sum2 = 0;
 
        int ele = 0;
 
        for(int i = 0; i < a; i++) {
            int d;
            cin >> d;
 
            sum1 += d;
            map1[d]++;
 
            if(map1[d] >= 2)
                ele = max(ele, d);
 
            sum2 += ele;
            temp.push_back(ele);
        }
 
        sum1 += sum2;
 
        // Find the MAD-prefix array one more time
        map<int,int> map2;
        int mad = 0;
        sum2 = 0;
 
        for(int i = 0; i < a; i++) {
            map2[temp[i]]++;
 
            if(map2[temp[i]] >= 2)
                mad = max(mad, temp[i]);
 
            temp[i] = mad;
        }
 
        // Remaining contribution
        for(int i = 0; i < a; i++) {
            sum1 += 1LL * temp[i] * (a - i);
        }
 
        cout << sum1 << "
";
    }
 
    return 0;
}