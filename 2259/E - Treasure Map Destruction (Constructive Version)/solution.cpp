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
	    vector<int> diff(a+1,0);
	    vector<int> restricted(a+1);
	    for(int i=0;i<a;i++){
	        if(arr[i]>0){
	            diff[max(0,i-arr[i]+1)]++;
	            diff[min(a,i+arr[i])]--;
	        }
	    }
	    restricted[0]=diff[0];
	    for(int i=1;i<=a;i++){
	        restricted[i]=diff[i]+restricted[i-1];
	    }
	    bool possible=true;
	    for(int i=0;i<a;i++){
	        if(arr[i]>=0){
	            if(i-arr[i]>=0&&!restricted[i-arr[i]]) continue;
	            if(i+arr[i]<a&&!restricted[i+arr[i]]) continue;
	            possible=false;
	        }
	    }
	    if(!possible) cout<<-1<<endl;
	    else{
	        for(int i=0;i<a;i++) cout<<!restricted[i];
	        cout<<endl;
	    }
	}
 
}