#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
 int t;
 cin>>t;
 string global="Timur";
 sort(global.begin(),global.end());
 while(t--){
     int a;
     cin>>a;
     string str;
     cin>>str;
     sort(str.begin(),str.end());
     if(a!=global.size()){
         cout<<"No"<<endl;
         continue;
     }
     bool b=false;
     for(int i=0;i<a;i++){
         if(str[i]!=global[i]){
             b=true;
             break;
         }
     }
     if(b) cout<<"NO"<<endl;
     else cout<<"Yes"<<endl;
 }
}