#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    int arr[a];
	    for(int i=0;i<a;i++)  cin>>arr[i];
	    int b;
	    cin>>b;
	    for(int i=0;i<b;i++){
	        string str;
	        cin>>str;
	       vector<int> vec(257,2e9);
	       if(str.size()!=a) {
	           cout<<"NO"<<endl;
	           continue ;
	       }
	       bool b=true;
	       unordered_map<int,char> map2;
	       for(int i=0;i<a;i++){
	           if(map2.count(arr[i])&&map2[arr[i]]!=str[i]) {
	              b=false;
	              break;
	          }
	           if(vec[str[i]]!=2e9&&vec[str[i]]!=arr[i]){
	              b=false;
	              break;
	           }
	           vec[str[i]]=arr[i];
	           map2[arr[i]]=str[i];
	       }
	       if(b) cout<<"Yes"<<endl;
	       else cout<<"No"<<endl;
	    }
	}
 
}