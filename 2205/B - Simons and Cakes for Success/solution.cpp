#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	   long no;
	   cin>>no;
	   long long ans=1;
	   long rep=no;
	   for(int i=2;i*i<=rep;i++){
	       bool b=false;
	       while(no%i==0){
	           no=no/i;
	           b=true;
	       }
	       if(b) ans*=i;
	       
	   }
	   if(no!=1) ans*=no;
	   cout<<ans<<endl;
	}
 
}