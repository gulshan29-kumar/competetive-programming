#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    string str;
	    cin>>str;
	    string ans="";
	    int a=str.size();
	    ans.push_back(str[0]);
	    for(int i=1;i<a;i+=2){
	        ans.push_back(str[i]);
	        
	    }
	    cout<<ans<<endl;
	}
 
}