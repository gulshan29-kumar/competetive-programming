#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	 long long k,l1,r1,l2,r2;
	 cin>>k>>l1>>r1>>l2>>r2;
	 long long no=1;
	 long long ans=0;
	 while(no<=max(r2,r1)){
	     if((min(r1,r2/no)-max(l1,(l2+no-1)/no)+1)>0) ans+=(min(r1,r2/no)-max(l1,(l2+no-1)/no)+1);
	     no*=k;
	 }
	 cout<<ans<<endl;
	}
 
}