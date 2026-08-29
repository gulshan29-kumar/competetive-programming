#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
		int t;
		cin>>t;
		while(t-->0){
		    int a;
		    cin>>a;
		    string str;
		    cin>>str;
		    int cnt0=0;
		    int cnt1=0;
		    
		    for(int i=0;i<a;i++){
		        if(str[i]=='1') cnt1++;
		        else cnt0++;
		    }
		    if(cnt0%2==0&&cnt1%2==1){
		        cout<<-1<<endl;
		        continue;
		    }
            if(cnt0%2!=0&&cnt0!=a){
               cout<<cnt0<<endl;
               for(int i=0;i<a;i++){
                   if(str[i]=='0') cout<<i+1<<" ";
               }
            }
            else if(cnt1%2==0&&cnt1!=0){
               cout<<cnt1<<endl;
               for(int i=0;i<a;i++){
                   if(str[i]=='1') cout<<i+1<<" ";
               }
            }
            else cout<<0;
            cout<<endl;
		}
}