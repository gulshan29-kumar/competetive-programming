#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	  int a;
	  cin>>a;
	  long long  arr[a];
	  long long sum=0;
	  long long min1=LLONG_MAX;
	  for(int i=0;i<a;i++){
	      cin>>arr[i];
	      sum+=arr[i];
	      min1=min(min1,arr[i]);
	  }
	  cout<<sum-min1*a<<endl;
	}
 
}