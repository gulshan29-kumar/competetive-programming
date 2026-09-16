#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    string str;
	    cin>>str;
	    str.pop_back();
	    str.pop_back();
	    str=str+"i";
	    cout<<str<<endl;
	}
}