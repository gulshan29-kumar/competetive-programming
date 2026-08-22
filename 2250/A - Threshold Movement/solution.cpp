#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int x;
	cin>>x;
	while(x--){
	    int a;
	    cin>>a;
	    int arr[a];
	    int max1=1e10;
	    int max2=0;
	    for(int i=0;i<a;i++) {
	        cin>>arr[i];
	        if(i%2==0) max1=min(max1,arr[i]);
	        else max2=max(max2,arr[i]);
	    }
	    if(max1-max2>=2&&a%2!=1) cout<<"Yes"<<endl;
	    else cout<<"No"<<endl;
	}
 
}