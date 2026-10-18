#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	   int a;
	   cin>>a;
	   int arr1[a];
	   int arr2[a];
	   int parent=-1;
	   for(int i=0;i<a;i++) {cin>>arr1[i];if(arr1[i]==i+1) parent=i;}
	   for(int j=0;j<a;j++) cin>>arr2[j];
	   vector<long long> weight(a,0);
	    long long maxi=0;
	   bool poss=true;
	   vector<int> comp(a,0);
	   for(int i=0;i<a;i++){
	       int child=arr2[i]-1;
	       int parent1=arr1[child]-1;
	       if(child!=parent&&comp[parent1]==0){
	           poss=false;break;
	       }
	       maxi=maxi+1;
	       weight[child]=child==parent?0:maxi-comp[parent1];
	       comp[child]=maxi;
	   }
	   if(!poss) cout<<-1<<endl;
	   else{
	       weight[parent]=0;
	       for(int i=0;i<a;i++){
	           cout<<weight[i]<<" ";
	       }
	       cout<<endl;
	   }
	   
	   
	}
 
}