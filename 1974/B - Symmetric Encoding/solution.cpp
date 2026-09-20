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
	  string str2="";
	  set<char> set1;
	  for(int i=0;i<a;i++){
	      if(set1.find(str[i])==set1.end()) str2.push_back(str[i]);
	      set1.insert(str[i]);
	  }
	  sort(str2.begin(),str2.end());
	  int low=0;
	  int high=str2.size()-1;
	  map<char,char> map1;
	  while(low<=high){
	      map1[str2[low]]=str2[high];
	      map1[str2[high]]=str2[low];
	      low++;
	      high--;
	  }
	  for(int i=0;i<a;i++){
	      cout<<map1[str[i]];
	  }
	  cout<<endl;
	}
 
}