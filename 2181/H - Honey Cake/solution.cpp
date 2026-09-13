#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	long long a,b,c;
	cin>>a>>b>>c;
	long long n;
	cin>>n;
	vector<long long> firstfact;
	vector<long long> secondfact;
	vector<long long> thirdfact;
	for(int i=1;i*i<=a;i++){
	    if(a%i==0){
	        firstfact.push_back(a/i);
	        firstfact.push_back(i);
	    }
	}
	for(int i=1;i*i<=b;i++){
	    if(b%i==0){
	        secondfact.push_back(b/i);
	        secondfact.push_back(i);
	    }
	}
	for(int i=1;i*i<=c;i++){
	    if(c%i==0){
	       thirdfact.push_back(c/i);
	      thirdfact.push_back(i);
	    }
	}
 
	int ans=-1;
	for(int i=0;i<firstfact.size();i++){
	    for(int j=0;j<secondfact.size();j++){
	        for(int k=0;k<thirdfact.size();k++){
	            if(firstfact[i]*secondfact[j]*thirdfact[k]==n){
	                cout<<firstfact[i]-1<<" "<<secondfact[j]-1<<" "<<thirdfact[k]-1<<endl;
	                ans=0;
	                break;
	            }
	        }
	        if(!ans) break;
	    }
	    if(!ans) break;
	}
	if(ans) cout<<ans<<endl;
 
}