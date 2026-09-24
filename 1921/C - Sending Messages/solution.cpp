#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int len;
        long long charge,per,onoff;
        cin>>len>>charge>>per>>onoff;
        long long arr[len];
        for(int i=0;i<len;i++) cin>>arr[i];
        sort(arr,arr+len);
        long long start=0;
        bool b=true;
        for(int i=0;i<len;i++){
            if(i==0) start+=min(arr[i]*per,onoff);
            else start+=min((arr[i]-arr[i-1])*per,onoff);
        }
        
        if(start<charge) cout<<"Yes"<<endl;
        else cout<<"No"<<endl;
    }
}