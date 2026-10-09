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
	  int ab=0;
	  for(int i=0;i<a;i++){
	      cin>>arr[i];
	  }
	  sort(arr,arr+a);
	  int no=arr[0];
	  int i=0;
	  while(i<a&&arr[i]==no) i++;
	  if(i==a||arr[i]-no>=no) cout<<arr[i]-no<<endl;
	  else cout<<no<<endl;
	}
 
}