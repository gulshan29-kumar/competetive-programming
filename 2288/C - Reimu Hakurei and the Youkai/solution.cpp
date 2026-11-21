#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
       long long a,b;
       cin>>a>>b;
       vector<long long> arr(a);
       for(int i=0;i<a;i++) cin>>arr[i];
       sort(arr.begin(),arr.end());
       long long curr=0;
       long long ans=0;
       for(int i=0;i<a-1;i++){
           if(curr+b>=arr[i]){
               curr+=b;
           }
           else{
               ans+=((arr[i]-curr-1)/b);
               curr+=((arr[i]-curr-1)/b)*b;
               curr+=b;
           }
       }
       cout<<ans<<endl;
    }
}