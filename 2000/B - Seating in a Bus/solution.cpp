#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    bool b=true;
	    set<int> set1;
	    for(int i=0;i<a;i++) {
	        int d;
	        cin>>d;
	        if(i==0) set1.insert(d);
	        else {
	            if(set1.find(d-1)==set1.end()&&set1.find(d+1)==set1.end())  b=false;
	        }
	        set1.insert(d);
	    }
	    if(b) cout<<"Yes"<<endl;
	    else cout<<"No"<<endl;
	    
	}
 
}