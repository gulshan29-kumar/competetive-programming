#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	string str;
	cin>>str;
    int ans=0;
	bool t=false;
	for(int i=0;i<str.size()-1;i++){
	    if(str[i]!=str[i+1]) ans++;
	    if(str[i]=='0'&&str[i+1]=='1') t=true;
	}
	if(t) ans--;
	cout<<ans+1<<endl;
	 
	}
 
}