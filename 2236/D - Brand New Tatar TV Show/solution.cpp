#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	  int a,b;
	  cin>>a>>b;
	  int arr[200000+1]={0};
	  int max1=INT_MIN;
	  for(int i=0;i<a;i++){
	      int d;
	      cin>>d;
	      arr[d]++;
	      max1=max(max1,d);
	  }
	  bool poss=false;
	  if(arr[max1]%2==0){
	      cout<<"Yes"<<endl;
	      continue;
	  }
	  for(int i=max1-1;i>=0;i--){
	      if(arr[i]!=0){
	          if(max1-i<=b){
	              poss=true;
	              break;
	          }
	          else{
	              if(arr[i]%2==0){
	                  poss=true;
	                  break;
	              }
	              else{
	                  max1=i;
	              }
	          }
	      }
	  }
	  if(poss) cout<<"Yes"<<endl;
	  else cout<<"No"<<endl;
     
	}
 
}