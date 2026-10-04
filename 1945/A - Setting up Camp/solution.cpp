#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    long long  a,b,c;
	    cin>>a>>b>>c;
	    int sum=0;
	    if(b%3==0){
	        cout<<a+b/3+(c+2)/3<<endl;
	    }
	    else if(b%3!=0&&(3-b%3)<=c){
	        cout<<a+(b)/3+1+(c-(3-b%3)+2)/3<<endl;
	    }
	    else cout<<-1<<endl;
	}
 
}