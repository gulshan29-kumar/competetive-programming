#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	 ios::sync_with_stdio(false);
     cin.tie(nullptr);
	int t;
	cin>>t;
	while(t--){
	 int a,b;
	 cin>>a>>b;
	 int arr[a];
	 map<int,pair<int,int>> map1;
	 set<int> set1;
	 for(int i=0;i<a;i++){
	     int d;
	     cin>>d;
	     if(map1.find(d)!=map1.end()) map1[d].second=i;
	     else map1[d]={i,i};
	 }
	 for(int i=0;i<b;i++){
	     int left,right;
	     cin>>left>>right;
	     if(map1.find(left)!=map1.end()&&map1.find(right)!=map1.end()){
	         if(map1[left].first<=map1[right].second) cout << "Yes
";
	         else  cout << "No
";;
	     }
	     else  cout << "No
";;
	 }
	 
	}
 
}