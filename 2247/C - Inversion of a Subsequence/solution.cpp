#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	   int a;
	   cin>>a;
	   int arr1[a];
	   int arr2[a];
	   for(int i=0;i<a;i++){
	       cin>>arr1[i];
	   }
	   for(int i=0;i<a;i++){
	       cin>>arr2[i];
	   }
	   bool inverted=false;
	   int cnt=0;
	   int cnt2=0;
	   bool poss2=false;
	   for(int i=0;i<a;i++){
	       if(arr1[i]!=arr2[i]){
	           inverted=true;
	           if(arr1[i]==1) cnt++;
	       }
	       if(arr1[i]==0&&arr2[i]==0) poss2=true;
	       if(arr1[i]==1) cnt2++;
	   }
	   if(!inverted) cout<<0<<endl;
	   else if(cnt%2==1) cout<<1<<endl;
	   else{
	       if(cnt%2==0&&cnt>0) cout<<2<<endl;
	       else if(cnt2&&poss2) cout<<2<<endl;
	       else cout<<-1<<endl;
	   }
	}
 
}