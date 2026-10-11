#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	string str;
	cin>>str;
	string  str2=str;
	sort(str2.begin(),str2.end());
	if(str2==str){
	    cout<<1<<endl;
	    continue;
	}
    int cnt0=0;
    int cnt1=0;
	int i=0;
	bool t=false;
	while(i<str.size()){
	    bool b=false;
	    while(i<str.size()&&str[i]=='0') {i++;b=true;}
	    if(b) cnt0++;
	    b=false;
	    while(i<str.size()&&str[i]=='1') {i++;b=true;};
	    if(b) cnt1++;
	}
	for(int i=0;i<str.size();i++){
	    if(str[i]=='0'&&str[i+1]=='1') t=true;
	    
	}
	int ans=cnt1+cnt0;
	if(t) ans--;
	cout<<ans<<endl;
	 
	}
 
}