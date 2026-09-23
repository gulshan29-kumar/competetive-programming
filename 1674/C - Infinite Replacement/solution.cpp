#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
   int t;
   cin>>t;
   while(t--){
     string str1;
     string str2;
     cin>>str1>>str2;
     int cnt=0;
     for(char ch:str2) if(ch=='a') cnt++;
     if(cnt&&str2.size()>1){
         cout<<-1<<endl;
         continue;
     }
     if(cnt==1&&str2.size()==1) {
         cout<<1<<endl;
         continue;
     }
     long long ans=1;
     for(int i=0;i<str1.size();i++){
         if(str1[i]=='a') ans=ans*2;
     }
     cout<<ans<<endl;
   }
}