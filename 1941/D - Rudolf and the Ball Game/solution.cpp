#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	   int a,b,c;
	   cin>>a>>b>>c;
	   set<int> setr;
	   setr.insert(c);
	   while(b>0){
	       int dist;
	       cin>>dist;
	       char ch;
	       cin>>ch;
	       set<int> setn;
	       for(auto it:setr){
	           int top=it;
	           if(ch=='0'){
	               if(top+dist>a) setn.insert(top+dist-a);
	               else setn.insert(top+dist);
	           }
	           else if(ch=='1'){
	               if(top-dist>0) setn.insert(top-dist);
	               else setn.insert(a+top-dist);
	           }
	           else{
	                if(top+dist>a) setn.insert(top+dist-a);
	               else setn.insert(top+dist);
	                if(top-dist>0) setn.insert(top-dist);
	               else setn.insert(a+top-dist);
	           }
	   }
	     setr=setn;
	     b--;
	   }
	   map<int,int> set1;
	  for(auto it:setr){
	      set1[it]=1;
	  }
	   cout<<set1.size()<<endl;
	   for(auto it:set1) cout<<it.first<<" ";
	   cout<<endl;
	}
 
}