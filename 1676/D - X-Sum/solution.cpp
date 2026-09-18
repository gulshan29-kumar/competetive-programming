#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	 int a,b;
	 cin>>a>>b;
     vector<long long> arr1(a+b-1);
     vector<long long> arr2(a+b-1);
     vector<vector<long long >> arr(a,vector<long long> (b));
     for(int i=0;i<a;i++){
         for(int j=0;j<b;j++){
             int d;
             cin>>d;
             arr[i][j]=d;
             arr2[i+j]+=d;
             arr1[i+b-j-1]+=d;
         }
     }
     long long ans=0;
    for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            ans=max(ans,arr1[i+b-j-1]+arr2[i+j]-arr[i][j]);
        }
    }
     cout<<ans<<endl;
	}
 
}