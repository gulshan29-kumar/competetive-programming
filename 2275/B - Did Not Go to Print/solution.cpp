#include <bits/stdc++.h>
using namespace std;
//q2
int main() {
	// your code goes here
   	    int t;
		cin>>t;
		while(t--){
		    int a;
		    cin>>a;
		    
		    string str;
		    cin>>str;
		    stack<int> stack1;
		    vector<int> ans;
		    for(int i=0;i<a;i++){
		        if(str[i]=='1') stack1.push(i);
		        if(str[i]=='2'){
		           if(!stack1.empty()) {stack1.pop();ans.push_back(i+1);}
		        }
		    }
		    while(!stack1.empty()){
		        ans.push_back(stack1.top()+1);
		        stack1.pop();
		    }
		    sort(ans.begin(),ans.end());
		    cout<<ans.size()<<endl;
		    for(auto it:ans) cout<<it<<" ";
		    cout<<endl;
	}
}