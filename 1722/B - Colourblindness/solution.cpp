#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
 int t;
 cin>>t;
 while(t--){
     int a;
     cin>>a;
     string str1,str2;
     cin>>str1>>str2;
     bool b=false;
     for(int i=0;i<a;i++){
         if(str1[i]!=str2[i]&&(str1[i]=='R'||str2[i]=='R')) {
             b=true;
             break;
         }
     }
     if(b) cout<<"No"<<endl;
     else cout<<"Yes"<<endl;
 }
}