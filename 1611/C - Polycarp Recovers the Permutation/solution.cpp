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
	   int maxi=INT_MIN;
	   for(int i=0;i<a;i++) {cin>>arr[i];maxi=max(maxi,arr[i]);}
	   if(arr[0]!=maxi&&arr[a-1]!=maxi) cout<<-1<<endl;
	   else{
	       for(int i=a-1;i>=0;i--){
	           if(arr[i]==maxi) continue;
	           cout<<arr[i]<<" ";
	       }
	       cout<<maxi<<endl;
	   }
	   
	}
 
}