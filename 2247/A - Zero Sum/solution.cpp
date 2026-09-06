#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	   int a;
	   cin>>a;
	   int cnt1=0;
	   for(int i=0;i<a;i++){
	       int d;
	       cin>>d;
	       if(d>=0) cnt1++;
	   }
	   if(abs(a-2*cnt1)%4!=0||a%2==1) cout<<"No"<<endl;
	   else cout<<"Yes"<<endl;
	}
 
}