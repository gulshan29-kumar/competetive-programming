#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,b;
	    cin>>a>>b;
	    int arr2[a];
	    vector<pair<int,int>> arr1;
	    for(int i=0;i<a;i++) {
	        int d;
	        cin>>d;
	        arr1.push_back({d,i});
	    }
	    for(int i=0;i<a;i++) cin>>arr2[i];
	    sort(arr1.begin(),arr1.end());
	    sort(arr2,arr2+a);
	    int ans[a];
	    for(int i=0;i<a;i++){
	        ans[arr1[i].second]=arr2[i];
	    }
	   for(auto it:ans) cout<<it<<" ";
	   cout<<endl;
	}
 
}