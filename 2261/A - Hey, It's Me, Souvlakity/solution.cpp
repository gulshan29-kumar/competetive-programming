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
	    int firstpos=-1;
	    int lastpos=-1;
	    bool b=false;
	    int cnt1=0;
	    for(int i=0;i<a;i++){
	        if(str[i]=='1'&&firstpos==-1) firstpos=i;
	        if(str[i]=='1') lastpos=i;
	        if(str[i]=='1') cnt1++;
	    }
	    if(cnt1==1) cout<<0<<endl;
	    else if(cnt1==2) cout<<1<<endl;
	    else cout<<lastpos-firstpos<<endl;
	  
	}
 
}