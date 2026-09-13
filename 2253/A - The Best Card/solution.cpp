#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    int req=a+1;
	    bool b=true;
	    for(int i=2;i*i<=req;i++){
	        if(req%i==0) b=false;
	    }
	    if(b) cout<<"Yes"<<endl;
	    else cout<<"No"<<endl;
	}
 
}