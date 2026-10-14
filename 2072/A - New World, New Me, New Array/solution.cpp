#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,b,c;
	    cin>>a>>b>>c;
	    a=abs(a);
	    b=abs(b);
	    c=abs(c);
	   int d=(b+c-1)/c;
	   if(d<=a) cout<<d<<endl;
	   else cout<<-1<<endl;
	   
	}
	
 
}