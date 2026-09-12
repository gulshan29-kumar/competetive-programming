#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	  int a,b,c;
	  cin>>a>>b>>c;
	  int arr[a];
	  for(int i=0;i<a;i++) cin>>arr[i];
	  int min2=b;
	  for(int i=b;i<=c-1;i++) if(arr[min2]>arr[i]) min2=i;
 
	      int req=a;
	      for(int i=0;i<a;i++){
	          if(i<b&&arr[i]>arr[min2]) {
	              req=i;
	            break;
	          }
	          if(i>=c&&arr[i]>arr[min2]){
	              req=i;
	              break;
	          }
	          if(i<b||i>=c) cout<<arr[i]<<" ";
	      }
	     for(int i=min2;i<=c-1;i++) cout<<arr[i]<<" ";
	      for(int i=b;i<min2;i++) cout<<arr[i]<<" ";
	      for(int i=req;i<b;i++) cout<<arr[i]<<" ";
	      for(int i=max(req,c);i<a;i++) cout<<arr[i]<<" ";
	      cout<<endl;
	      
	  
	}
 
}