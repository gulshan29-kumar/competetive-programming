#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here 
	int t;
	cin>>t;
	while(t--){
	    int a;cin>>a;
	    int cnt0=0;
	    int cnt1=0;
	    for(int i=0;i<a;i++){
	        int d;
	        cin>>d;
	        if(d==0) cnt0++;
	        else cnt1++;
	    }
	    if(cnt1>=cnt0) cout<<"Bessie"<<endl;
	    else cout<<"Elsie"<<endl;
	}
}