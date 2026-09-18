#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	 int a,b;
	 cin>>a>>b;
	 string arr[a];
	 for(int i=0;i<a;i++) cin>>arr[i];
	 long long ans=LLONG_MAX;
	 for(int i=0;i<a;i++){
	     for(int j=i+1;j<a;j++){
	          long long diff=0;
	         for(int k=0;k<b;k++){
	            diff+=abs(arr[i][k]-arr[j][k]);
	         }
	         ans=min(ans,diff);
	     }
	 }
	 cout<<ans<<endl;
	}
 
}