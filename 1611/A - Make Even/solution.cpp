#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    long long a;
	    cin>>a;
	    int even=0;
	    if(a%2==0) {cout<<0<<endl;continue;}
	    int lastdigit=0;
	    while(a!=0){
	        if((a%10)%2==0) even=1;
	        lastdigit=a%10;
	        a/=10;
	    }
	    if(even==1){
	        if(lastdigit%2==0) cout<<1<<endl;
	        else cout<<2<<endl;
	    }
	    else cout<<-1<<endl;
	    
	}
 
}