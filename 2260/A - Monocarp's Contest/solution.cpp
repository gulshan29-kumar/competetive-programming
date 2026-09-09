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
	    int cnt=0;
	    for(int i=0;i<a;i++) {cin>>arr[i];if(arr[i]==0) cnt++;}
	    if(cnt<=1) cout<<-1<<endl;
	    else if(arr[0]==0&&arr[a-1]==0) cout<<0<<endl;
	    else if(arr[0]==1&&arr[a-1]==1) cout<<2<<endl;
	    else cout<<1<<endl;
	}
 
}