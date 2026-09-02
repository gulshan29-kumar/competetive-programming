#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	    int a;
	    cin>>a;
	    int ans=0;
	    for(int i=0;i<a;i++){
	        int d;
	        cin>>d;
	        ans=max(ans,d);
	    }
	    cout<<ans<<endl;
	}
 
}