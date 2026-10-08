#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    string str;
	    cin>>a>>str;
	    set<string> ans;
	    for(int i=0;i<a-1;i++){
	        string str1="";
	        str1.push_back(str[i]);
	        str1.push_back(str[i+1]);
	        ans.insert(str1);
	    }
	    cout<<ans.size()<<endl;
	}
 
}