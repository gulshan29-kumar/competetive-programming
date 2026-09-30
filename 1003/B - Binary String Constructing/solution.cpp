#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	    int a,b,x;
	    cin>>a>>b>>x;
	    string ans="";
	    if(a>b){
	    for(int i=0;i<x;i++){
	        if(i%2==0) {
	          ans.push_back('0');
	            a--;
	        }
	        else {
	             ans.push_back('1');
	            b--;
	        }
	    }}
	    else{
	        for(int i=0;i<x;i++){
	        if(i%2==1) {
	           ans.push_back('0');
	            a--;
	        }
	        else {
	            ans.push_back('1');
	            b--;
	        }
	    }
	    }
	    if(ans[ans.size()-1]=='0'){
	        for(int i=0;i<a;i++){
	            ans.push_back('0');
	        }
	        for(int i=0;i<b;i++){
	            ans.push_back('1');
	        }
	    }
	    else{
	        for(int i=0;i<b;i++){
	            ans.push_back('1');
	        }
	        for(int i=0;i<a;i++){
	            ans.push_back('0');
	        }
	    }
	    cout<<ans<<endl;
	   
 
}