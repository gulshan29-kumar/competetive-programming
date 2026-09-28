#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--) {
	    int a;
	    cin>>a;
	    int arr[51];
	    memset(arr,0,sizeof(arr));
	    for(int i=0;i<a;i++) {
	        int d;
	        cin>>d;
	        arr[d]++;
	    }
	     bool b=false;
	    for(int i=50;i>=0;i--){
	        if(arr[i]%2==1) {
	            b=true;
	            break;
	        }
	    }
	    if(b) cout<<"Yes"<<endl;
	    else cout<<"No"<<endl;
	}
 
}