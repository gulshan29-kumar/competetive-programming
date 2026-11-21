#include<bits/stdc++.h>
 
using namespace std;
 
int main(){
int t;
cin>>t;
 
int n;
string s;
 
while(t--){
cin>>n>>s;
bool need[26]={};
for(int i=0;i<n/2;i++){
int u=min(s[i],s[n-i-1])-'a';
int v=max(s[i],s[n-i-1])-'a';
 
for(int x=u+1;x<=v;x++) need[x]=true;
}
 
int ans=0;
 
for(int x=0;x<26;x++) ans+=need[x];
 
cout<<ans<<endl;
 
}
 
 
}