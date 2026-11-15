#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here 
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    if(a>=4){
	        vector<int> arr(a+1);
	        for(int i=1;i<=a;i++) arr[i]=i;
	        swap(arr[1],arr[4]);
	        for(int i=1;i<=a;i++){
	            cout<<arr[i]<<" ";
	        }
	        cout<<endl;
	    }
	    else cout<<-1<<endl;
	}
 
}