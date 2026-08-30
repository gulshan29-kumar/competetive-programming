#include <bits/stdc++.h>
using namespace std;
int gcd(int a,int b){
    if(a==0) return b;
    if(b==0) return a;
    if(a>b) return gcd(a%b,b);
    if(b>a) return gcd(a,b%a);
    
}
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
	        int ans=gcd(arr[0],arr[a-1]);
	        cout<<ans<<endl;
	    }
 
}