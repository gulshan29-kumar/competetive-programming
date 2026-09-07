#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	    int a;
	    cin>>a;
	    int arr[a];
	    int cnt0=0;
	    for(int i=0;i<a;i++){
	        cin>>arr[i];
	        if(arr[i]==0) cnt0++;
	    }
	    if(cnt0==1) {
	        cout<<"No"<<endl;continue;}
	    string ans="";
	    int first=-1;
	    for(int i=0;i<a;i++){
	        if(arr[i]==0){
	            if(first==-1) {
	                ans=ans+'A';
	                first=1;
	            }
	            else ans=ans+'B';
	        }
	        else ans=ans+'C';
	    }
	    cout<<"Yes"<<endl;
	    cout<<ans<<endl;
	}
 
}