#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,b;
	    cin>>a>>b;
	    int maxi=0;
	    unordered_map<int,int> mapi;
	    for(int i=0;i<a;i++){
	       int d;
	       cin>>d;
	       mapi[d]++;
	       maxi=max(maxi,mapi[d]);
	    }
	    bool bi=true;
	    vector<int> freq;
	    for(auto it:mapi){
	        freq.push_back(it.second);
	        if(it.second!=maxi){
	            bi=false;
	        }
	    }
	    int total=a;
	   int len=freq.size();
	   int ans=0;
	   int sum=0;
	   int k=b;
	   sort(freq.begin(),freq.end());
	   int sub=0;
	   for(int i=0;i<len;i++){
	      int rlen=len-i;
	      int curr_freq=freq[i]-sub;
	      if(curr_freq==0) continue;
	      int diff=k-total;
	      if(diff%(rlen)==0){
	          int delta=diff/rlen;
	          if(curr_freq+delta>=1) ans++;
	      }
	      total-=curr_freq*rlen;
	      sub+=curr_freq;
	   }
	   cout<<ans<<endl;
	   
	    
	}
 
}