#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    int min1=INT_MAX;
	    int max1=INT_MIN;
	    for(int i=0;i<a;i++){
	        int d;
	        cin>>d;
	        min1=min(min1,d);
	        max1=max(max1,d);
	    }
	    cout<<max1-min1+1<<endl;
	}
 
}