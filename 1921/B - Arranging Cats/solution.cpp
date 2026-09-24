#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int a;
        cin>>a;
       string str1;
       string str2;
       cin>>str1>>str2;
       int cnt1=0;
       int cnt2=0;
       for(int i=0;i<a;i++){
           if(str1[i]=='1'&&str2[i]=='0') cnt1++;
           if(str2[i]=='1'&&str1[i]=='0') cnt2++;
       }
       cout<<min(cnt1,cnt2)+abs(cnt1-cnt2)<<endl;
    }
}