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
	   int pos1=-1;
	   int ans=0;
	   for(int i=0;i<a;i++){
	       if(str[i]=='1') pos1=i;
	       else{
	           if(i-pos1<=b&&pos1!=-1)  continue;
	           ans++;
	       }
	   }
	   cout<<ans<<endl;
	}
	
 
}