#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,b;
	    cin>>a>>b;
	    int prev=-1;
	    int cnt=1;
	    bool bi=true;
	    for(int i=0;i<a;i++){
	        int d;
	        cin>>d;
	        if(d==prev) cnt++;
	        else cnt=1;
	        if(cnt>=b) {
	            bi=false;
	        }
	        prev=d;
	    }
	   if(!bi) cout<<"No"<<endl;
	   else cout<<"Yes"<<endl;
	}
 
}