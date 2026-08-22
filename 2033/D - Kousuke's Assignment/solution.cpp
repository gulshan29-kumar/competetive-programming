#include <bits/stdc++.h>
using namespace std;
 
int main() {
	int t;
	cin>>t;
	while(t--){
	    long long  n;
	    cin>>n;
	    long long a[n];
	    for(int i=0; i<n; i++){
	        cin>>a[i];
	    }
	    set<long long > st;
	    st.insert(0);
	    long long sum =0;
	    int count =0;
	    
	    for(int i=0; i<n; i++){
	        sum+= a[i];
	        
	        
	        if(st.count(sum)){
	            count++;
	            sum=0;
	            st.clear();
	            st.insert(0);
	            
	        }
	        else st.insert(sum);
	    }
	   
	  cout<<count<<endl;
	}
 
}