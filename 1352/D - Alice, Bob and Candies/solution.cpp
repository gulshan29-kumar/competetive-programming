#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
 
	while(t--){
	 int a;
	 cin>>a;
	 long long arr[a];
	 for(int i=0;i<a;i++) cin>>arr[i];
	 int low=0;
	 int high=a-1;
	 int al=0;
	 int bo=0;
	 int cnt=0;
	 int totala=0;
	 int totalb=0;
	 while(low<=high){
	     int i=-1;al=0;
	     while(low<=high&&al<=bo){
	         totala+=arr[low];
	         al+=arr[low++];
	         if(i++==-1) cnt++;
	     }
	     i=-1;bo=0;
	     while(low<=high&&bo<=al){
	         totalb+=arr[high];
	         bo+=arr[high--];
	         if(i++==-1) cnt++;
	     }
	 }
	 cout<<cnt<<" "<<totala<<" "<<totalb<<endl;
	}
 
}