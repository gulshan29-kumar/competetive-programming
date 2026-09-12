#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    int arr[11]={0};
	    for(int i=0;i<a;i++){
	        int d;
	        cin>>d;
	        arr[d]++;
	    }
	    for(int i=10;i>=0;i--){
	        if(arr[i]!=0) {
	            cout<<arr[i]<<endl;
	            break;
	        }
	    }
	}
 
}