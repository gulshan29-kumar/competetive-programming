#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	   int a;
	   cin>>a;
	   long long arr[a];
	   long long gcd1=0;
	   for(int i=0;i<a;i++){
	       cin>>arr[i];
	      gcd1=gcd(gcd1,arr[i]);
	   }
	   long long ans=gcd1+1;
	   for(int i=2;i<=60;i++){
	       if(gcd(gcd1,i)==1){
	           ans=i;
	           break;
	       }
	   }
	   cout<<ans<<endl;
	 
	}
 
}