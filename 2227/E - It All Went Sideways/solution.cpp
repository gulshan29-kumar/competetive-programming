#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    long long  arr[a];
	    for(int i=0;i<a;i++) cin>>arr[i];
	    stack<long long > stack2;
	    int i=a-1;
	    long long ans=0;
	    while(i>=0){
	        if(!stack2.empty()){
	            while(i>=0&&stack2.top()<arr[i]){
	                ans+=arr[i]-stack2.top();
	                arr[i]=stack2.top();
	                i--;
	            }
	        }
	       if(i>=0) stack2.push(arr[i]);
	       i--;
	    }
	    long long  additional=0;
	    i=a-1;
	    stack<long long > stack1;
	    while(i>=0){
	        if(!stack1.empty()){
	            long long cnt=0;
	            while(i>=0&&stack1.top()<arr[i]){
	                cnt+=arr[i]-stack1.top();
	                i--;
	            }
	            additional=max(additional,cnt);
	        }
	        if(i>=0) stack1.push(arr[i]-1);
	       i--;
	        
	    }
	    cout<<ans+additional<<endl;
	}
 
}