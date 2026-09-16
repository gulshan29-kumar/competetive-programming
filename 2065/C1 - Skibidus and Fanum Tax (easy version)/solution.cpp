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
	   int no;
	   for(int i=0;i<a;i++) cin>>arr[i];
	   cin>>no;
	   bool b1=true;
	   arr[a-1]=max(arr[a-1],no-arr[a-1]);
	   for(int i=a-2;i>=0;i--){
	       if(arr[i]>arr[i+1]){
	           arr[i]=no-arr[i];
	       }
	       else{
	           if(no-arr[i]<=arr[i+1]) arr[i]=max(no-arr[i],arr[i]);
	       }
	       if(arr[i]>arr[i+1]){
	           b1=false;
	           break;
	       }
	   }
	 
	   if(b1) cout<<"Yes"<<endl;
	   else cout<<"No"<<endl;
	   
	}
}