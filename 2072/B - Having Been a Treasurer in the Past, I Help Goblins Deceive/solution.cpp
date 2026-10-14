#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    string str;
	    cin>>str;
	    int cnt_=0;
	    long long ans=0;
	    for(int i=0;i<a;i++){
	        if(str[i]=='-') cnt_++;
	    }
	    for(int i=0;i<cnt_;i++){
	        long long curr=i+1;
	        long long left=cnt_-curr;
	        ans=max(ans,curr*left*(a-cnt_));
	    }
	    cout<<ans<<endl;
	}
	
 
}