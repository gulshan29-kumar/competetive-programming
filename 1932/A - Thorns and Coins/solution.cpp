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
	    int sum=0;
	    for(int i=0;i<a;i++){
	        if(i+1<a&&str[i]=='*'&&str[i+1]=='*') break;
	        if(str[i]=='@') sum++;
	    }
	    cout<<sum<<endl;
	}
 
}