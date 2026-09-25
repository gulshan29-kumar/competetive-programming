#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    char ch;
	    cin>>ch;
	    string str;
	    cin>>str;
	    int i=0;
	    int j=a-1;
	    int ans=0;
	    while(i<j){
	        if(str[i]==str[j]){
	            i++;
	            j--;
	        }
	        else{
	            if(str[i]==ch||str[j]==ch) ans+=1;
	            else ans+=2;
	            i++;
	            j--;
	        }
	    }
	    cout<<ans<<endl;
	}
 
}