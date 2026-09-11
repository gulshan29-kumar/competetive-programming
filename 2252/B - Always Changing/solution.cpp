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
	   int cnt=0;
	   int ans1=0;
	   int ans0=0;
	   int cnt1=0;
	   if(str[0]=='1') cnt1++;
	   for(int i=1;i<a;i++){
	       if(str[i]=='1') cnt1++;
	       if(str[i]==str[i-1]) cnt++;
	       else{
	           if(str[i]=='0') ans1+=cnt;
	           else ans0+=cnt;
	           cnt=0;
	       }
	   }
	   if(cnt!=0) {
	         if(str[a-1]=='0') ans0+=cnt;
	           else ans1+=cnt;
	   }   
	   if(abs(a-2*cnt1)<=2) cout<<ans1+ans0+max(0,abs(ans1-ans0)-1)<<endl;
	   else cout<<-1<<endl;
	}
 
}