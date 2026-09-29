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
	    for(int i=0;i<a;i++){
	        cin>>arr[i];
	    }
	    sort(arr,arr+a,greater());
	    bool b=true;
	    for(int i=0;i<a-1;i++){
	        if(arr[i]==arr[i+1]){
	            b=false;
	            break;
	        }
	    }
	    if(!b) cout<<-1<<endl;
	    else {
	        for(int it:arr) cout<<it<<" ";
	        cout<<endl;
	    }
	}
 
}