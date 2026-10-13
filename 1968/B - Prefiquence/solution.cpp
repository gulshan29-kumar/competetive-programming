#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,b;
	    cin>>a>>b;
	    string str1,str2;
	    cin>>str1>>str2;
	    int i=0;
	    int j=0;
	    int ans=0;
	    while(i<a&&j<b){
	        if(str1[i]==str2[j]){
	            ans++;
	            i++;
	            j++;
	        }
	       else  j++;
	    }
	    cout<<ans<<endl;
	}
 
}