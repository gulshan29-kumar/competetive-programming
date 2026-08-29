#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	    int a;
	    cin>>a;
	    string str;
	    cin>>str;
	    int ans=1;
	    str=str+str;
	    bool rep=false;
	    for(int i=0;i<a;i++){
	        int cnt=1;
	    for(int j=i+1;j<i+a;j++){
	         if(str[j]!=str[j-1]) cnt++;
	        
	    }
	        ans=max(ans,cnt);
	    }
	    cout<<ans<<endl;
	    
	}
 
}