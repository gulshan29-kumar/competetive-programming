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
	    int cnto=0;
	    int cnte=0;
	    for(int i=0;i<a;i++){
	        if(arr[i]%2==1) cnto++;
	        else cnte++;
	    }
        if(a==2&&cnte==1&&cnto==1) cout<<"Larpity"<<endl;
        else if(a==3&&cnto==3) cout<<"Larpity"<<endl;
        else cout<<"Moggity"<<endl;
	}
 
}