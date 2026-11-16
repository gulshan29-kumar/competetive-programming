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
	    int x=0;
	    for(char ch:str) if(ch=='0') x++;
	    x=min(max(x,a-x)+b,a);
	    int y=a-x;
	    long long ans=1LL*x*(x+1)/2+1LL*y*(y+1)/2+1;
	    cout<<ans<<endl;
	}
 
}