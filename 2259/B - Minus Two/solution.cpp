#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    int cnto=0;
	    int cnteo=0;
	    int cntee=0;
	    for(int i=0;i<a;i++){
	        int d;
	        cin>>d;
	        if(d%2==1) cnto++;
	        else if((d/2)%2==1) cnteo++;
	        else cntee++;
	    }
	    cout<<max(cnto,max(cnteo,cntee))<<endl;
	}
 
}