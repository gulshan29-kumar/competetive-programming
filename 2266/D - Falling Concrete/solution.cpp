#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	 int a;
	 cin>>a;
	 map<int,int> map1;
	 for(int i=0;i<a;i++){
	     int d;
	     cin>>d;
	     map1[d-i]=1;
	 }
	 int ans=0;
	 for(auto it:map1){
	     if(map1.find(it.first-1)==map1.end()){
	     int cnt=0;
	     while(map1.find(it.first+cnt)!=map1.end()){
	         cnt++;
	     }
	     ans=max(ans,cnt);}
	 }
	 cout<<ans<<endl;
	}
 
}