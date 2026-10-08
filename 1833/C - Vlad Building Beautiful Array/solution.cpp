#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    int ood=INT_MAX;
	    int eve=INT_MAX;
	    for(int i=0;i<a;i++){
	        int d;
	        cin>>d;
	        if(d%2==0) eve=min(eve,d);
	        else ood=min(ood,d);
	    }
	    if(eve==INT_MAX||ood==INT_MAX) cout<<"Yes"<<endl;
	    else if(ood<eve) cout<<"Yes"<<endl;
	    else cout<<"No"<<endl;
	}
 
}