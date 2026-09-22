#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	   int a;
	   cin>>a;
	   set<int> set;
	   for(int i=0;i<a;i++){
	       string str;
	       cin>>str;
	       int cnt=0;
	       for(int j=0;j<a;j++){
	           if(str[j]=='1') cnt++;
	       }
	       if(cnt!=0) set.insert(cnt);
	   }
	   if(set.size()==1) cout<<"SQUARE"<<endl;
	   else cout<<"TRIANGLE"<<endl;
	}
 
}