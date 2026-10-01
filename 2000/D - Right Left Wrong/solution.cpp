#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    long long  sum=0;
	    vector<long long> arr(a+2,0);
	    for(int i=0;i<a;i++){
	        int d;
	        cin>>d;
	        sum+=d;
	        arr[i+1]=sum;
	    }
	    string str;
	    cin>>str;
	    long long  ans=0;
	    int i=0;
	    int j=a-1;
	    while(i<j){
	    while(i<=j&&str[i]=='R') i++;
	    while(j>=i&&str[j]=='L') j--;
	    if(j<=i){
	       break;
	    }
	    ans+=arr[j+1]-arr[i];
	    j--;i++;
	    }
	    cout<<ans<<endl;
	    
	}
 
}