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
     
     vector<int> vec;
     long long sum=0;
     for(int i=0;i<a;i++){
         if(str[i]=='L') {
             sum+=i;
             if(a-i-1-i>0) vec.push_back(a-i-1-i);
             
         }
         if(str[i]=='R') {
             sum+=(a-i-1);
             if(i-a+i+1>0) vec.push_back(i-a+i+1);
     }}
     sort(vec.begin(),vec.end(),greater<int>());
     int low=0;int size_v=vec.size();
     for(int i=0;i<a;i++){
         if(low<size_v){
             sum+=vec[low++];
             cout<<sum<<" ";
         }
         else cout<<sum<<" ";
     }
     cout<<endl;
 }
}