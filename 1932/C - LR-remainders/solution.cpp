#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	   int a,b;
	   cin>>a>>b;
	   int arr[a];
	   for(int i=0;i<a;i++) {
	       cin>>arr[i];
	   }
	   string str;
	   cin>>str;
	   int low=0;
	   int high=a-1;
	   vector<int> temp;
	   for(int i=0;i<a;i++){
	       if(str[i]=='L') temp.push_back(low++);
	       else temp.push_back(high--);
	   }
	   long long product=1;
	   vector<long long> ans;
	   for(int i=a-1;i>=0;i--){
	      ans.push_back((product*arr[temp[i]])%b);
	       product=product*arr[temp[i]]%b;
	   }
	   reverse(ans.begin(),ans.end());
	   for(auto it:ans) cout<<it<<" ";
	   cout<<endl;
	}
 
}