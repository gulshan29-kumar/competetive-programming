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
	    for(int i=0;i<a;i++){
	        cin>>arr[i];
	    }
	    map<int,int> map1;
	    for(int i=0;i<a;i++){
	        int sum=arr[i];
	        int ans=0;
	        for(int j=1;j<=100;j++){
	            while(sum!=0){
	                ans+=(sum%10)*(sum%10);
	                sum/=10;
	            }
	            sum=ans;
	            ans=0;
	        }
	        map1[sum]++;
	    }
	    long long ans=0;
	    for(auto it:map1){
	        ans+=it.second*(it.second-1)/2;
	    }
	    cout<<ans<<endl;
     } 
}