#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	    int a;
	    long long h,r;
	    cin>>a>>h>>r;
	    long long  arr[a];
	    long long  prefix[a];
	    long long sum=0;
	    for(int i=0;i<a;i++){
	        cin>>arr[i];
	        sum+=arr[i];
	    }
	    prefix[a-1]=arr[a-1];
	    for(int i=a-2;i>=0;i--){
	        prefix[i]=max(prefix[i+1],arr[i]);
	    }
	    long long reload=h/sum;
	    long long  tttf=(reload)*r+reload*a;
	    h=h-(reload)*sum;
	    if(h==0) {
	        cout<<tttf-r<<endl;
	        continue;
	    }
	    long long  min1=arr[0];
	    long long  sum1=0;
	    long long ans=0;
	    for(int i=0;i<a;i++){
	        sum1+=arr[i];
	        min1=min(arr[i],min1);
	        long long best = sum1;
            if (i + 1 < a) {
                best = max(best, sum1 - min1 + prefix[i + 1]);
            }
            if (best >= h) {
                ans = i + 1;
                break;
            }
	    }
	  cout<<tttf+ans<<endl;
	    
	}
 
}