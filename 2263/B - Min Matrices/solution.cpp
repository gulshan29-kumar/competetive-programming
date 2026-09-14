#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here 
	int t;
	cin>>t;
	while(t--){
	   int a,k;
	   cin>>a>>k;
	   if(k<a||k>2*a-1){
	       cout<<-1<<endl;
	       continue;
	   }
	   vector<vector<int>> ans(a,vector<int> (a,-1));
	    int temp=1;
	    int diagonal=2*a-1-k;
	    int start=-1;
	    for(int i=0;i<a&&diagonal!=0;i++){
	        ans[i][i]=temp++;
	        start=i;
	        diagonal--;
	    }
	    start++;
	    for(int i=start;i<a;i++){
	        ans[start][i]=temp++;
	    }
	    for(int i=start+1;i<a;i++){
	        ans[i][start]=temp++;
	    }
	    
	   for(int i=0;i<a;i++){
	       for(int j=0;j<a;j++){
	           if(ans[i][j]!=-1) cout<<ans[i][j]<<" ";
	           else cout<<temp++<<" ";
	       }
	       cout<<endl;
	   }
	   
	}
}