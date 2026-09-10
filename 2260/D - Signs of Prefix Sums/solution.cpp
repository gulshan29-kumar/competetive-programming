#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    string str;
	    cin>>str;
	    if(str[0]=='0'||str.find("00")!=string::npos){
	        cout<<-1<<endl;
	        continue;
	    }
	    if(str.find("+--+")!=string::npos||str.find("-++-")!=string::npos){
	        cout<<3<<endl;
	        continue;
	    }
	    if(str.find("-+")!=string::npos||str.find("+-")!=string::npos) {
	        cout<<2<<endl;
	        continue;
	    }
	    int ans=1;
	    for(int i=0;i<a;i+=2){
	        if(str[i]=='0') ans=2;
	    }
	    cout<<ans<<endl;
	}
 
}