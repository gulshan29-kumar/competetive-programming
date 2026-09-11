#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    vector<long long> arr(a);
	    for(int i=0;i<a;i++){
	        cin>>arr[i];
	    }
	    vector<long long > diff(a-1);
	    for(int i=0;i<a-1;i++) diff[i]=arr[i+1]-arr[i];
	    for(int i=0;i<a-1;){
	        int j=i;
	        while(j < a-1 && (diff[i] & 1) == (diff[j] & 1)) j++;
	        sort(diff.begin()+i,diff.begin()+j);
	        i=j;
	    }
	    long long  curr=arr[0];
	    cout<<arr[0]<<" ";
	    for(int i=0;i<a-1;i++){
	        curr+=diff[i];
	        cout<<curr<<" ";
	    }
	    cout<<endl;
	}
 
}