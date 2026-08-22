#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int x,a,b;
	    cin>>x>>a>>b;
	    int arr[x];
	    for(int i=0;i<x;i++) cin>>arr[i];
	    bool bo=true;
	    for(int i=0;i<x;i++){
	        int d=abs(i+1-arr[i]);
	        int gc=gcd(a,b);
	        if(d%gc!=0){
	            bo=false;
	            break;
	        }
	    }
	    if(bo) cout<<"Yes";
	    else cout<<"No";
	    cout<<endl;
	}
 
}