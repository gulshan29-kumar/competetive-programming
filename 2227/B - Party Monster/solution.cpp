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
	    int cnto=0;
	    int cntc=0;
	    for(int i=0;i<a;i++){
	        if(str[i]=='(') cnto++;
	        else cntc++;
	    }
	    if(cntc==cnto) cout<<"Yes"<<endl;
	    else cout<<"No"<<endl;
	}
 
}