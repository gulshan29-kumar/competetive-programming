#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	   int a;
	   cin>>a;
	   string str1,str2;
	   cin>>str1>>str2;
	   int arr[26]={0};
	   for(int i=0;i<a;i++){
	       arr[str1[i]-'a']++;
	       arr[str2[i]-'a']--;
	   }
	   bool b=true;
	   for(int it:arr) {
	       if(it!=0) {
	           b=false;
	           break;
	       }
	   }
	   if(b) cout<<"Yes"<<endl;
	   else cout<<"No"<<endl;
	}
 
}