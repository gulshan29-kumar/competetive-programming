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
	   for(int i=0;i<a;i++) cin>>arr[i];
	   bool b=true;
	   for(int i=0;i<a-2;i++){
	       if(arr[i]>0){
	           arr[i+1]=arr[i+1]-2*arr[i];
	           arr[i+2]=arr[i+2]-arr[i];
	           arr[i]=0;
	       }
	       if(arr[i]!=0) b=false;
	   }
	   for(int i=a-2;i<a;i++) if(arr[i]!=0) b=false;
	   if(b) cout<<"Yes"<<endl;
	   else cout<<"No"<<endl;
	}
 
}