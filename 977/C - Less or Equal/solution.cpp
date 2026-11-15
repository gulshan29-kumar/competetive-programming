#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int a,b;
	cin>>a>>b;
	int arr[a+1];
	arr[0]=1;
	for(int i=1;i<=a;i++) cin>>arr[i];
	sort(arr,arr+a+1);
	if(arr[b]!=arr[b+1])  cout<<arr[b]<<endl;
	else cout<<-1<<endl;
 
 
}