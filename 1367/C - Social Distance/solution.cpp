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
	   vector<int> suffix(a+1,0);
	   suffix[a]=1e8;
	   for(int i=a-1;i>=0;i--){
	       if(str[i]=='1') suffix[i]=i;
	       else suffix[i]=suffix[i+1];
	   }
	   int ans=0;
	   int prev=-1000;
	   for(int i=0;i<a;i++){
	       if(str[i]=='0'&&i-prev-1>=b&&suffix[i]-i-1>=b){
	           prev=i;
	           ans++;
	       }
	       if(str[i]=='1') prev=i;
	   }
	   cout<<ans<<endl;
	}
 
}