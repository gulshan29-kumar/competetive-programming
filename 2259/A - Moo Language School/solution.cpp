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
	    int cnt=0;
	    for(int i=0;i<a;i+=b){
	        bool poss=true;
	        int run=0;
	        for(int j=i;j<min(i+b,a);j++){
	             run=1;
	            if(str[j]=='0') poss=false;
	        }
	        if(poss&&run) cnt++;
	    }
	    cout<<cnt<<endl;
	}
 
}