#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
 
	while(t--){
	    long long  a;
	    cin>>a;
	    long long mul=1;
	    int cnt=0;
	    vector<long long> ans;
	    while(a!=0){
	        if(a%10!=0) {
	            cnt++;
	            ans.push_back(a%10*mul);
	        }
	        a/=10;
	        mul*=10;
	    }
	    cout<<cnt<<endl;
	    for(auto it:ans) cout<<it<<" ";
	    cout<<endl;
	}
 
}