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
	    if((a-b)==3){
	       int s=0;
	       int in=0;
	       int x=0;
	       for(int i=0;i<b;i++){
	           for(int j=0;j<a;j++){
	               if(str2[i]==str1[j]) {str1[j]='.';str2[i]='.';break;}
	           }
	       }
	       for(int i=0;i<a;i++){
	           if(str1[i]=='s') s=1;
	           if(str1[i]=='i') in=1;
	           if(str1[i]=='x') x=1;
	       }
	       int cnt=0;
	       for(int i=0;i<b;i++) if(str2[i]=='.') cnt++;
	       if((s+in+x)==3&&cnt==b) cout<<"Yes"<<endl;
	       else cout<<"No"<<endl;
	    }
	    else cout<<"No"<<endl;
	}
 
}