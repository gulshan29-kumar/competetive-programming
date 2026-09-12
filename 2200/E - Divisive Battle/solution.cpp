#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	  int a;
	  cin>>a;
	  long long arr[a];
	  for(int i=0;i<a;i++){
	      cin>>arr[i];
	  }
	  bool b=true;
	  long long min1=-1;
	  for(int i=1;i<a;i++) if(arr[i]<arr[i-1]) b=false;
	  bool bo2=false;
	  for(int i=0;i<a;i++){
	      set<long long> set1;
	      long long temp=arr[i];
	     for(int j=2;j*j<=temp;j++){
	         while(temp%j==0){
	             set1.insert(j);
	            temp=temp/j;
	            
	         }
	     }
	     if(temp>1) set1.insert(temp);
	    
	    
	   if(set1.size()>=2) {
	         bo2=true;
	         break;
	     }
	     else if(min1>*set1.begin()){
	         bo2=true;
	         break;
	     }
	     min1=max(min1,*set1.begin());
	     
	  }
	  if(!bo2||b) cout<<"Bob"<<endl;
	  else cout<<"Alice"<<endl;
	  
	}
 
}