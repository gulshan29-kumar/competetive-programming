#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	 ios::sync_with_stdio(false);
     cin.tie(nullptr);
	int t;
	cin>>t;
	while(t--){
	  string str;
	  int price;
	  cin>>str>>price;
	  vector<vector<int>> ans(26);
	  int len=str.size();
	  int total=0;
	  for(int i=0;i<len;i++){
	      ans[str[i]-'a'].push_back(i);
	      total+=(str[i]-'a'+1);
	  }
	  int i=25;
	  while(i>=0&&total>price){
	      if(ans[i].size()>0){
	          for(int j=0;j<ans[i].size()&&total>price;j++){
	              total-=(i+1);
	              str[ans[i][j]]='0';
	          }
	      }
	      i--;
	  }
	  string st="";
	  for(i=0;i<len;i++) if(str[i]!='0') st.push_back(str[i]);
	  cout<<st<<endl;
	 
	}
 
}