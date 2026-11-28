#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    vector<long long> pos;
	    vector<long long> neg;
	    neg.push_back(0);
	    for(int i=0;i<a;i++){
	        int d;
	        cin>>d;
	        if(d>=0) pos.push_back(d);
	        else neg.push_back(d);
	    }
	    sort(pos.begin(),pos.end());
	    sort(neg.begin(),neg.end());
	    int psz=pos.size();
	    int nsx=neg.size();
	    long long range=pos[psz-1]-neg[0];
	    if(range==0) {
	        cout<<"No"<<endl;
	        continue;
	    }
	    vector<long long> ans(a);
	    long long sum=0;
	    int l=0;
	    int k=0;
	    for(int i=0;i<a;i++){
	        if(l<psz&&sum+pos[l]<range) {sum+=pos[l];ans[i]=pos[l++];}
	        else{
	            ans[i]=neg[k];
	            sum+=neg[k++];
	        }
	    }
	    cout<<"Yes"<<endl;
	    for(int i=0;i<a;i++) cout<<ans[i]<<" ";
	    cout<<endl;
	}
 
}