#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    vector<int> arr[6];
	    for(int i=0;i<a;i++){
	        int d;
	        cin>>d;
	        arr[d%6].push_back(d);
	    }
	    vector<int> ans;
	    for(int it:arr[3]){
	        ans.push_back(it);
	    }
	    for(int i=1;i<=5;i+=4){
	        for(int it:arr[i]) ans.push_back(it);
	    }
	    for(int i=4;i>=0;i-=2){
	        for(int it:arr[i]){
	            ans.push_back(it);
	        }
	    }
	    for(int it:ans){
	        cout<<it<<" ";
	    }
	    cout<<endl;
	}
 
}