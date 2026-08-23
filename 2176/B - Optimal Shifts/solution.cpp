#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	   int a;
	   cin>>a;
	   string str;
	   cin>>str;
	   set<int> set;
	   int i=0;
	   while(i<a&&str[i]=='0') i++;
	   int low=i;
	   for(int j=low;j<low+a;j++){
	       if(str[j%a]=='0'){
	           if(j>i) set.insert(j-i);
	           else set.insert(a-i+j);
	       }
	       else i=j;
	   }
	   cout<<set.size()<<endl;
	}
 
}