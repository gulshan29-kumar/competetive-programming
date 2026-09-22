#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    string str;
	    cin>>str;
	    int cnt1=0;
	    for(int i=0;i<str.size();i++){
	        if(str[i]=='A') cnt1++;
	    }
	    if(2*cnt1>=str.size()) cout<<"A"<<endl;
	    else cout<<"B"<<endl;
	}
 
}