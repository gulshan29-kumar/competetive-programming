#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	   int a;
	   cin>>a;
	   int arr[a];
	   for(int i=0;i<a;i++) cin>>arr[i];
	   vector<int> left(a,0);
	   vector<int> right(a,0);
	   stack<int> stack2;
	   for(int i=0;i<a;i++){
	       while(!stack2.empty()&&stack2.top()<=arr[i]) stack2.pop();
	       left[i]=stack2.size();
	       stack2.push(arr[i]);
	   }
	   stack<int> stack1;
	    for(int i=a-1;i>=0;i--){
	       while(!stack1.empty()&&stack1.top()<=arr[i]) stack1.pop();
	       right[i]=stack1.size();
	       stack1.push(arr[i]);
	   }
	   int ans=a-1;
	   for(int i=0;i<a;i++){
	       ans=min(ans,a-left[i]-right[i]);
	   }
	   cout<<ans-1<<endl;
	}
 
}