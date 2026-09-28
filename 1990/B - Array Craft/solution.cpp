#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,prefix,suffix;
	    cin>>a>>prefix>>suffix;
	    int arr[a];
	    for(int i=suffix-1;i<=prefix-1;i++){
	        arr[i]=1;
	    }
	    int toggle=-1;
	    for(int i=suffix-2;i>=0;i--){
	        arr[i]=toggle;
	        if(toggle==-1) toggle=1;
	        else toggle=-1;
	    }
	      toggle=-1;
	      for(int i=prefix;i<a;i++){
	        arr[i]=toggle;
	        if(toggle==-1) toggle=1;
	        else toggle=-1;
	    }
	    for(auto it:arr) cout<<it<<" ";
	    cout<<endl;
	}
 
}