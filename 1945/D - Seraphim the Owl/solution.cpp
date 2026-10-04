#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	   int a,b;
	   cin>>a>>b;
	   b--;
	   long long arr1[a];
	   long long  arr2[a];
	   for(int i=0;i<a;i++){
	       cin>>arr1[i];
	   }
	   for(int j=0;j<a;j++) cin>>arr2[j];
	   long long ans=LLONG_MAX;
	   long long  sum=0;
	   for(int i=b;i>=0;i--){
	       ans=min(ans,sum+arr1[i]);
	       sum+=arr2[i];
	   }
	   for(int i=b+1;i<a;i++){
	       ans+=min(arr1[i],arr2[i]);
	   }
	   cout<<ans<<endl;
	   
	}
 
}