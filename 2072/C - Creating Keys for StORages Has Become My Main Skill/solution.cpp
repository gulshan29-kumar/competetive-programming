#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,b;
	    cin>>a>>b;
	    int sum=0;
	    if(a>1) cout<<0<<" ";
	    for(int i=1;i<a-1;i++){
	        if((i&b)==i) {cout<<i<<" ";sum|=i;}
	        else cout<<b<<" ";
	    }
	    if(((a-1)&b)==(a-1)&&((sum|(a-1))==b)) cout<<(a-1)<<" "<<endl;
	    else cout<<b<<endl;
	}
	
 
}