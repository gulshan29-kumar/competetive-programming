#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    long long a,b,c;
	    cin>>a>>b>>c;
	    cout<<max(abs(a-b),(a+c-b))<<endl;
	}
 
}