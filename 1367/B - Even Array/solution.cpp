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
	    int cnte=0;
	    int cnto=0;
	    for(int i=0;i<a;i++){
	        if(arr[i]%2==i%2) continue;
	        else {
	            if(arr[i]%2==1) cnto++;
	            else cnte++;
	        }
	    }
	    if(cnto==cnte) cout<<cnto<<endl;
	    else cout<<-1<<endl;
	}
 
}