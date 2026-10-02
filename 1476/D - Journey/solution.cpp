#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    string str;
	    cin>>str;
	    vector<int> prefix(a,0);
	    vector<int> suffix(a,0);
	    int cnt=0;
	    char flip=str[0];
	    for(int i=0;i<a;i++){
	        if(flip==str[i]) cnt++;
	        else{
	            cnt=1;
	            flip=str[i];
	        }
	        prefix[i]=cnt;
	        if(flip=='L') flip='R';
	        else flip='L';
	    }
	    flip=str[a-1];
	    cnt=0;
	    for(int i=a-1;i>=0;i--){
	         if(flip==str[i]) cnt++;
	        else{
	            cnt=1;
	            flip=str[i];
	        }
	        suffix[i]=cnt;
	        if(flip=='L') flip='R';
	        else flip='L';
	    }
	    for(int i=0;i<=a;i++){
	        int city=1;
	        if(i==0){
	            if(str[i]=='R') city+=suffix[i];
	        }
	        else if(i==a){
	            if(str[i-1]=='L') city+=prefix[i-1];
	        }
	        else{
	            if(str[i]=='R') city+=suffix[i];
	            if(str[i-1]=='L') city+=prefix[i-1];
	        }
	        cout<<city<<" ";
	    }
	    cout<<endl;
	}
 
}