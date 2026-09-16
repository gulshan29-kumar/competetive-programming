#include <bits/stdc++.h>
using namespace std;
int func(vector<long long>& arr,long long  source,long long destination){
    int low=0;
    int high=arr.size()-1;
    int cnt=-1;
    while(low<=high){
        int mid=low+(-low+high)/2;
        if(arr[mid]-source<=destination){
            cnt=mid;
            low=mid+1;
        }
        else high=mid-1;
    }
    return cnt;
}
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	   int a,b;
	   cin>>a>>b;
	   vector<long long> arr1(a);
	   vector<long long> arr2(b);
	   for(int i=0;i<a;i++) cin>>arr1[i];
	   for(int i=0;i<b;i++) cin>>arr2[i];
	   sort(arr2.begin(),arr2.end());
	   arr1[a-1]=max(arr1[a-1],arr2[b-1]-arr1[a-1]);
	   bool b1=true;
	   for(int i=a-2;i>=0;i--){
	       if(arr1[i]>arr1[i+1]){
	           int idx=func(arr2,arr1[i],arr1[i+1]);
	           if(idx!=-1) arr1[i]=arr2[idx]-arr1[i];
	       }
	       else{
	           int idx=func(arr2,arr1[i],arr1[i+1]);
	           if(idx!=-1) arr1[i]=max(arr1[i],arr2[idx]-arr1[i]);
	       }
	       if(arr1[i]>arr1[i+1]){
	           b1=false;
	           break;
	       }
	   }
	   if(b1) cout<<"Yes"<<endl;
	   else cout<<"No"<<endl;
	   
	   
	}
}