#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,l,r;
	    cin>>a>>l>>r;
	    vector<long long> left;
	    vector<long long> right;
	    
	    for(int i=0;i<a;i++) {
	        long long d;
	        cin>>d;
	        if(i>=l-1) right.push_back(d);
	        if(i<=r-1) left.push_back(d);
	    }
	    sort(left.begin(),left.end());
	    sort(right.begin(),right.end());
	    int size=r-l+1;
	    long long sum1=0;
	    long long  sum2=0;
	    for(int i=0;i<size;i++){
	        sum1+=left[i];
	        sum2+=right[i];
	    }
	    cout<<min(sum1,sum2)<<endl;
	   
	}
 
}