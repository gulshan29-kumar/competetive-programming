#include <bits/stdc++.h>
using namespace std;
 
int func(const vector<long long>& arr, long long source, long long destination){
    int low = 0;
    int high = arr.size() - 1;
    int cnt = -1; // Corrected: initialize to -1 to track if NO valid element exists
    
    while(low <= high){
        int mid = low + (high - low) / 2;
        // Corrected: rearranged formula to prevent subtraction underflow 
        if(arr[mid] <= source + destination){ 
            cnt = mid;
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }
    return cnt;
}
 
int main() {
    // Fast I/O
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int t;
    if (!(cin >> t)) return 0;
    
    while(t--){
        int a, b;
        cin >> a >> b;
        
        // Corrected: use long long to prevent overflow during additions/subtractions
        vector<long long> arr1(a);
        vector<long long> arr2(b);
        
        for(int i = 0; i < a; i++) cin >> arr1[i];
        for(int i = 0; i < b; i++) cin >> arr2[i];
        
        sort(arr2.begin(), arr2.end());
        arr1[a-1] = max(arr1[a-1], arr2[b-1] - arr1[a-1]);
        bool possible = true;
        
        for(int i = a - 2; i >= 0; i--){
            int idx = func(arr2, arr1[i], arr1[i+1]);
            
            if(arr1[i] > arr1[i+1]){
                // We MUST reduce arr1[i]. Only do it if we found a valid index.
                if(idx != -1) {
                    arr1[i] = arr2[idx] - arr1[i];
                }
            }
            else{
                // We don't have to reduce, but we can maximize it.
                if(idx != -1) {
                    arr1[i] = max(arr1[i], arr2[idx] - arr1[i]);
                }
            }
            
            // If even after trying to replace it, it remains strictly greater, we fail.
            if(arr1[i] > arr1[i+1]){
                possible = false;
                break;
            }
        }
        
        if(possible) cout << "Yes
";
        else cout << "No
";
    }
    return 0;
}