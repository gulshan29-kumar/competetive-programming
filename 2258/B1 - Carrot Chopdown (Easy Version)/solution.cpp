#include <bits/stdc++.h>
using namespace std;
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	    int a,b;
	    cin>>a>>b;
	    int arr[a];
	    vector<int> freq(b+1,0);
	    for(int i=0;i<a;i++) {
	        cin>>arr[i];
	        freq[arr[i]]++;
	    }
	   int ans=a;
	   int toatl=a;
	   vector<int> freq2(b+1,0);
	   for(int i=1;i<=b;i++){
	       freq2[i]=freq[i]+freq2[i-1];
	   }
	   for(int i=1;i<=b;i++){
	      int cur = freq[i] + (a - freq2[i]);
 
            if (2 * i <= b)
                cur += freq[2 * i];
 
            ans = max(ans, cur);
	   }
	    cout<<ans<<endl;
	}
}