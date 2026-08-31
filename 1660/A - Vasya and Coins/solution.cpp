#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	    int a,b;
	    cin>>a>>b;
	    if(a==0){
	        cout<<1<<endl;
	        continue;
	    }
	    cout<<2*b+a+1<<endl;
	}
 
}