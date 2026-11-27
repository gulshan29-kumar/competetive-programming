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
	    if(a%2==1){
	        cout<<"No"<<endl;
	        continue;
	    }
	    bool poss=false;
	    for(int i=0;i<a-1;i++){
	        if(str[i]==str[i+1]) {
	            poss=true;
	            break;
	        }
	    }
	    if(poss) cout<<"Yes"<<endl;
	    else cout<<"No"<<endl;
	    
	    
	}
 
}
 