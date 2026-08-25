#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	    int a,b;
	    cin>>a>>b;
	    string str;
	    cin>>str;
	    int idx=0;
	    a*=2;
	    while(idx<a&&str[idx]=='1') idx++;
	    int even=0;
	    int odd=0;
	    int cnt1=0;
	    for(int i=idx;i<idx+a;i++){
	        if(str[i%a]=='1'){
	            cnt1++;
	            if(i%2==0){
	                if(str[(i+1)%a]=='0') odd++;
	                else even++;
	            }
	            else{
	                 if(str[(i+1)%a]=='0') even++;
	                else odd++;
	            }
	        }
	    }
	    cout<<odd<<" "<<even<<endl;
	}
 
}