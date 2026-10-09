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
	  int peak=0;
	  int down=0;
	  for(int i=0;i<a-1;i++){
	      ab+=abs(arr[i]-arr[i+1]);
	      if(i>0){
	          if((arr[i-1]<arr[i]&&arr[i]>arr[i+1])||(arr[i-1]>arr[i]&&arr[i]<arr[i+1])){
	              peak=max(abs(abs(2*arr[i]-arr[i+1]-arr[i-1])-abs(arr[i+1]-arr[i-1])),peak);
	          }
	      }
	  }
	  peak=max(peak,abs(arr[a-1]-arr[a-2]));
	  peak=max(peak,abs(arr[0]-arr[1]));
	  cout<<ab-peak<<endl;
	}
 
}