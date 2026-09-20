#include <bits/stdc++.h>
using namespace std;
 
// Helper function to count pairs, subtracting identical triples
long long count_valid_pairs(vector<int>& v) {
    if(v.size() < 2) return 0;
    
    long long no = v.size();
    long long total_pairs = no * (no - 1) / 2; // Your original formula
    
    // Sort to easily count duplicates without memory-heavy maps
    sort(v.begin(), v.end());
    
    long long identical_pairs = 0;
    long long count = 1;
    
    for(size_t i = 1; i < v.size(); i++) {
        if(v[i] == v[i-1]) {
            count++;
        } else {
            identical_pairs += count * (count - 1) / 2;
            count = 1;
        }
    }
    // Add the final group of duplicates
    identical_pairs += count * (count - 1) / 2;
    
    // Total pairs minus the ones that are 100% identical
    return total_pairs - identical_pairs; 
}
 
int main() {
    // Fast I/O is mandatory for Codeforces problems with large inputs
    ios_base::sync_with_stdio(false); 
    cin.tie(NULL);
    
    int t;
    if (!(cin >> t)) return 0;
    
    while(t--) {
        int a;
        cin >> a;
        
        vector<int> arr(a);
        for(int i = 0; i < a; i++) cin >> arr[i];
        
        // Changed map key from string to pair<int, int> for speed and accuracy
        // Changed sets to vectors to properly handle duplicates
        map<pair<int, int>, pair<vector<int>, vector<int>>> map1;
        
        for(int i = 0; i < a - 1; i++){
            pair<int, int> p = {arr[i], arr[i+1]};
            if(i - 1 >= 0) map1[p].first.push_back(arr[i-1]);
            if(i + 2 <= a - 1) map1[p].second.push_back(arr[i+2]);
        }
        
        long long ans = 0;
        
        for(auto& it : map1){
            ans += count_valid_pairs(it.second.first);
            ans += count_valid_pairs(it.second.second);
        }
        
        map<pair<int, int>, vector<int>> map2;
        
        for(int i = 0; i < a - 2; i++){
            pair<int, int> p = {arr[i], arr[i+2]};
            // Corrected to push arr[i+1] (the middle element)
            map2[p].push_back(arr[i+1]); 
        }
        
        for(auto& it : map2){
            ans += count_valid_pairs(it.second);
        }
        
        cout << ans << "
"; // "
" is significantly faster than endl
    }
    
    return 0;
}