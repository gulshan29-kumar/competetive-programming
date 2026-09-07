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
	   for(int i=0;i<a;i++) cin>>arr[i];
	   bool suffix[a]={false};
	   for(int i=a-1;i>=0;i--){
	       if(arr[i]==1||arr[i]==-1){
	           suffix[i]=true;
	       }
	       if(i<a-1) suffix[i]|=suffix[i+1];
	   }
	   bool poss1=false;
	   for(int i=0;i<a;i++){
	       if(i+1<a&&arr[i]==-1&&!suffix[i+1]){
	           arr[i]=1;
	           break;
	       }
	       if(arr[i]==1) poss1=true;
	       else if(arr[i]==-1){
	           if(!poss1){
	               arr[i]=1;
	               poss1=true;
	           }
	           else arr[i]=0;
	       }
	   }
	   if(arr[a-1]==0&&suffix[a-1]) arr[a-1]=1;
	   for(int it:arr) cout<<it<<" ";
	   cout<<endl;
	
	   
	}
 
}