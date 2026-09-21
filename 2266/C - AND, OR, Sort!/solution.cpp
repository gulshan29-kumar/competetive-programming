#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	   int a;
	   cin>>a;
	   string str;
	   cin>>str;
	   vector<int> prefix(a);
	   int cnto=0;
	   for(int i=a-1;i>=0;i--){
	       if(str[i]=='0') cnto++;
	       prefix[i]=cnto;
	   }
	   if(str[0]=='1'){
	       cout<<prefix[0]<<endl;
	       continue;
	   }
	   int ans=a;
	   int cnt1=0;
	   for(int i=0;i<a;i++){
	       ans=min(ans,cnt1+prefix[i]);
	       if(str[i]=='1') cnt1++;
	   }
	    ans=min(ans,cnt1);
	   cout<<ans<<endl;
	}
 
}