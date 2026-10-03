#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
        int arr[a];
        for(int i=0;i<a;i++) cin>>arr[i];
        bool b=true;
        int maxi=0;
        for(int i=0;i<a;i++){
            maxi=max(maxi,arr[i]);
            if(abs(maxi-arr[i])>1){
                b=false;
                break;
            }
        }
        if(b) cout<<"Yes"<<endl;
        else cout<<"No"<<endl;
	   
	}
 
}