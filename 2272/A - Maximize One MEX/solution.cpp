#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,b;
	    cin>>a>>b;
	    int arr[a];
	    for(int i=0;i<a;i++) cin>>arr[i];
	    int idx1=-1;
	    int idx2=-1;
	    int target=a-(b-1);
	    for(int i=0;i<target;i++){
	        bool b=false;
	        for(int j=0;j<target;j++){
	            if(arr[j]==i) b=true;
	        }
	        if(!b){
	           
	            for(int j=0;j<a;j++){
	                if(arr[j]==i) idx2=j;
	                if(idx1==-1||(arr[idx1]<arr[j]&&j<target)) idx1=j;
	            }
	            break;
	        }
	    }
	    if(idx2==-1) cout<<-1<<endl;
	    else cout<<idx1+1<<" "<<idx2+1<<endl;
	}
 
}