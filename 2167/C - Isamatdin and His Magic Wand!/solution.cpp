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
	   int cnte=0;
	   for(int i=0;i<a;i++){
	       cin>>arr[i];
	       if(arr[i]%2==0) cnte++;
	   }
	   if(cnte!=a&&cnte!=0) sort(arr,arr+a);
	       
	   for(int it:arr) cout<<it<<" ";
	   cout<<endl;
	 
	}
 
}