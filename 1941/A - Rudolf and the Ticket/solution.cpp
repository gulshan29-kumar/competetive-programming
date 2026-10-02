#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,b,c;
	    cin>>a>>b>>c;
	    int arr[a];
	    int arr2[b];
	    for(int i=0;i<a;i++){
	        cin>>arr[i];
	    }
	    for(int i=0;i<b;i++) cin>>arr2[i];
	    sort(arr,arr+a);
	    sort(arr2,arr2+b);
	    
	    int ans=0;
	    for(int i=0;i<a;i++){
	        int target=c-arr[i];
	        if(target<0) break;
	        for(int j=0;j<b;j++){
	            if(arr2[j]<=target) ans++;
	        }
	    }
	    cout<<ans<<endl;
	}
 
}