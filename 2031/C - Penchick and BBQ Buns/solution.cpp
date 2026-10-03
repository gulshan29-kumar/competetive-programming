#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    if(a%2==0){
	        int cnt=1;
	        for(int i=1;i<=a;i+=2){
	            cout<<cnt<<" ";
	            cout<<cnt<<" ";
	            cnt++;
	        }
	        cout<<endl;
	    }
	    else{
	       if(a<27) {cout<<-1<<endl;continue;}
	        int cnt=1;
	        int val=a;
	        for(int i=1;i<=a;i++){
	           if(i==1||i==10||i==26) cout<<val<<" ";
	           else if(i==11||i==27) cout<<val+1<<" ";
	           else  {
	               cout<<cnt<<" ";
	                cout<<cnt<<" ";
	                i++;
	               cnt++;
	           }
	        }
	        cout<<endl;
	    }
	}
 
}