#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    char arr[2*a][2*a];
	    memset(arr,'.',sizeof(arr));
	    int cnt=0;
	    for(int i=0;i<2*a;i++){
	        cnt++;
	        for(int j=0;j<2*a;j+=4){
	            arr[i][j]='#';
	            arr[i][j+1]='#';
	        }
	        if(cnt==2){
	            cnt=0;
	            i+=2;
	        }
	    }
	    cnt=0;
	     for(int i=2;i<2*a;i++){
	        cnt++;
	        for(int j=2;j<2*a;j+=4){
	            arr[i][j]='#';
	            arr[i][j+1]='#';
	        }
	        if(cnt==2){
	            cnt=0;
	            i+=2;
	        }
	    }
	    for(int i=0;i<2*a;i++){
	        for(int j=0;j<2*a;j++){
	            cout<<arr[i][j];
	        }
	        cout<<endl;
	    }
	}
 
}