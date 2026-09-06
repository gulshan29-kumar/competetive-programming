#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	  int a,q;
	  cin>>a>>q;
	  vector<int> arr(a);
	  for(int i=0;i<a;i++){
	      cin>>arr[i];
	  }
	  if(is_sorted(arr.begin(),arr.end())){
	      cout<<0<<endl;
	      continue;
	  }
	  for(int i=0;i<30;i++){
	      int blocksize=1<<(i+1);
	      int maximum=-1;
	      int poss=1;
	      for(int j=0;j<a;j+=blocksize){
	          int currmin=INT_MAX;
	          int currmax=INT_MIN;
	          for(int k=j;k<min(j+blocksize,a);k++){
	              currmax=max(currmax,arr[k]);
	              currmin=min(currmin,arr[k]);
	          }
	          if(currmin<maximum){
	              poss=0;
	              break;
	          }
	          maximum=max(currmax,maximum);
	      }
	      if(poss){
	          cout<<(1<<i)<<endl;
	          break;
	      }
	      
	  }
	}
 
}