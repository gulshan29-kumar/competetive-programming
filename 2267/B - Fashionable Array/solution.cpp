#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	   int a;
	   cin>>a;
	   int arr[101];
	   memset(arr,0,sizeof(arr));
	   for(int i=0;i<a;i++){
	       int d;
	       cin>>d;
	       arr[d]++;
	   }
	   for(int i=100;i>=0;i--){
	       for(int j=100;j>=0;j--){
	            if(arr[j]==0) continue;
	              cout<<j<<" ";
	              arr[j]--;
	           }
	   }
	   cout<<endl;
	}
 
}