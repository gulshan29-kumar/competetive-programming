#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
   int t;
   cin>>t;
   while(t--){
      string str;
      cin>>str;
      if(str[0]>str[1]) cout<<(str[0]-'a')*25+(str[1]-'a')+1<<endl;
      else cout<<(str[0]-'a')*25+(str[1]-'a')<<endl;
   }
}