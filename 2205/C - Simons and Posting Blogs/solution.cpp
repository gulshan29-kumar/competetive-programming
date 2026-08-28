#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	   int a;
	   cin>>a;
	   vector<vector<long long>> inpu(a);
	   for(int i=0;i<a;i++){
	       int len;
	       cin>>len;
	       vector<long long> temp(len);
	       for(int j=0;j<len;j++){
	           cin>>temp[j];
	       }
	       set<long long> set;
	       for(int j=len-1;j>=0;j--){
	           if(set.find(temp[j])==set.end()){
	               set.insert(temp[j]);
	               inpu[i].push_back(temp[j]);
	           }
	       }
	   }
	   vector<long long> used(a,0);
	   vector<long long> ans;
	   int cnt=0;
	   while(cnt<a){
	       int min=-1;
	       for(int i=0;i<a;i++) {
	         if(min==-1){
	             if(!used[i]) min=i;
	             else continue;
	         }
	         if(!used[i]&&inpu[i]<inpu[min]) min=i; 
	       }
	       if(min==-1) break;
	       set<long long> set;
	       used[min]=1;
	       for(auto it:inpu[min]){
	           set.insert(it);
	           ans.push_back(it);
	       }
	       for(int i=0;i<a;i++){
	           if(!used[i]){
	               vector<long long> temp;
	               for(auto it:inpu[i]){
	                   if(set.find(it)==set.end()) temp.push_back(it);
	               }
	               inpu[i]=temp;
	           }
	       }
	       cnt++;
	   }
	   for(auto it:ans){
	       cout<<it<<" ";
	   }
	   cout<<endl;
	}
 
}