#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    int ans=0;
	    for(int i=0;i<a;i++){
	        int d;
	        cin>>d;
	        if(d>ans) ans=d;
	        else{
	            ans=(ans/d+1)*d;
	        }
	    }
	    cout<<ans<<endl;
	}
 
}