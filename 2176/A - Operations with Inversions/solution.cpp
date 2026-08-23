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
	    int max1=0;
	    for(int i=0;i<a;i++){
	        int d;
	        cin>>d;
	        max1=max(max1,d);
	        if(d<max1) ans++;
	    }
	    cout<<ans<<endl;
	}
 
}