#include <bits/stdc++.h> 
using namespace std; 
 
long long poss(long long mid, vector<long long>& arr, long long x){ 
    if(mid == 0) return 2e9; 
    long long cnt = 0; 
    
    // Valid positions before the first friend
    cnt += max(0LL, (arr[0] - mid) - 0 + 1);
    
    // Valid positions after the last friend
    cnt += max(0LL, x - (arr[arr.size()-1] + mid) + 1);
    
    // Valid positions between friends
    for(int i = 1; i < arr.size(); i++){ 
       cnt += max(0LL, (arr[i] - mid) - (arr[i-1] + mid) + 1);
    } 
    return cnt; 
} 
 
int main() { 
    int t; 
    cin >> t; 
    while(t--){ 
        long long n, k, x; 
        cin >> n >> k >> x; 
        vector<long long> ans; 
        for(int i = 0; i < n; i++){ 
            long long d; 
            cin >> d; 
            ans.push_back(d); 
        } 
        sort(ans.begin(), ans.end()); 
        
        long long diff = 0; 
        long long low = 0; 
        long long high = x;  // Fix: The max distance is x, not x/k
        
        while(low <= high){ 
            long long mid = (low + high) / 2; 
            if(poss(mid, ans, x) >= k){ 
                diff = mid; 
                low = mid + 1; 
            } 
            else high = mid - 1; 
        } 
        
        vector<long long> ans1; 
        if(diff == 0){
            for(int i = 0; i < k; i++) cout << i << " "; 
            cout << "
";
            continue;
        }
        
        long long curr, right;
        
        // 1. Reconstruct: Fill before the first friend
        curr = 0; 
        right = ans[0] - diff;
        while(k > 0 && curr <= right) { 
            ans1.push_back(curr++); 
            k--; 
        }
        
        // 2. Reconstruct: Fill between friends
        for(int i = 1; i < ans.size(); i++){ 
            curr = ans[i-1] + diff;
            right = ans[i] - diff;
            while(k > 0 && curr <= right) { 
                ans1.push_back(curr++); 
                k--; 
            }
        } 
        
        // 3. Reconstruct: Fill after the last friend
        curr = ans[ans.size()-1] + diff;
        right = x;
        while(k > 0 && curr <= right) { 
            ans1.push_back(curr++); 
            k--; 
        }
        
        for(int i = 0; i < ans1.size(); i++){ 
            cout << ans1[i] << " "; 
        }
        cout << "
"; 
    } 
    return 0;
}