#include <bits/stdc++.h>
using namespace std;
bool poss(int arr[],int reqi,int k,int a){
    for(int i=0;i<a;i++){
        int req=reqi;
        int ke=k;
        for(int j=i;j<a;j++){
            if(arr[j]>=req) return true;
            if(j==a-1) break;
            ke-=req-arr[j];
            if(ke<0) break;
             req--;
        }
    }
    return false;
}
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,k;
	    cin>>a>>k;
	    int arr[a];
	    int low=INT_MAX;
	    int high=INT_MIN;
	    for(int i=0;i<a;i++) {cin>>arr[i];low=min(low,arr[i]);high=max(high,arr[i]);}
	    int ans=0;
	    high+=min(k,a-1);
	    while(low<=high){
	        int mid=low+(high-low)/2;
	        if(poss(arr,mid,k,a)){
	            ans=mid;
	            low=mid+1;
	        }
	        else high=mid-1;
	    }
	    cout<<ans<<endl;
	}
 
}