#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
 int t;
 cin>>t;
 while(t--){
     int a;
     cin>>a;
     vector<vector<string>> name(3,vector<string> (a));
     map<string,int> map;
     for(int i=0;i<3;i++){
         for(int j=0;j<a;j++){
             cin>>name[i][j];
             map[name[i][j]]++;
         }
     }
     for(int i=0;i<3;i++){
         int count=0;
         for(int j=0;j<a;j++){
             if(map[name[i][j]]==1) count+=3;
             else if(map[name[i][j]]==2) count+=1;
         }
         cout<<count<<" ";
     }
     cout<<endl;
 }
}