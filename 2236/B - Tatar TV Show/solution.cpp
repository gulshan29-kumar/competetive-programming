#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,b;
	    cin>>a>>b;
	    string str;
	    cin>>str;
	    bool poss1=true;
	    for(int i=0;i<b;i++){
            int cnt1=0;
	       for(int j=i;j<a;j+=b){
	           if(str[j]=='1') cnt1++;
	       }
	       if(cnt1%2==1){
	           poss1=false;
	           break;
	       }
	    }
	    if(poss1) cout<<"Yes"<<endl;
	    else cout<<"No"<<endl;
	}
 
}