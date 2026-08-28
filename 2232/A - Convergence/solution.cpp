#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	    int a;
	    cin>>a;
	    int arr[a];
	    for(int i=0;i<a;i++) cin>>arr[i];
	    int ans=a-1;
	    for(int i=0;i<a;i++){
	        int cntmin=0;
	        int cntmax=0;
	        for(int j=0;j<a;j++){
	            if(arr[j]!=arr[i]){
	                if(arr[j]<arr[i]) cntmin++;
	                else cntmax++;
	            }
	        }
	        ans=min(ans,abs(cntmin-cntmax)+min(cntmin,cntmax));
	    }
	    cout<<ans<<endl;
	}
 
}