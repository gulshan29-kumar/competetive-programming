#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    int cnt0=0;
	    int cnt1=0;
	    int cnt2=0;
	    for(int i=0;i<a;i++){
	        int b;
	        cin>>b;
	        if(b==0) cnt0++;
	        else if(b==1) cnt1++;
	        else cnt2++;
	    }
	    int extra=0;
	    if(cnt1>cnt2) extra+=(cnt1-cnt2)/3;
	    else extra+=(cnt2-cnt1)/3;
	    cout<<cnt0+min(cnt1,cnt2)+extra<<endl;
	}
 
}