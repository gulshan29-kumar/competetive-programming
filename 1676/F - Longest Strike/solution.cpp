#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,b;
	    cin>>a>>b;
	    map<long long,long long> freqmap;
	    for(int i=0;i<a;i++){
	        long long d;
	        cin>>d;
	        freqmap[d]++;
	    }
	    long long low=-1;
	    long long high=-1;
	    long long max_diff=-1;
	    for(auto it:freqmap){
	        if(it.second<b) continue;
	        long long left=-1;
	        long long right=-1;
	        long long req=it.first;
	        int i=0;
	        while(freqmap.find(req+i)!=freqmap.end()&&freqmap[req+i]>=b){
	            if(left==-1) left=it.first+i;
	            right=it.first+i;
	            freqmap[req+i]=0;i++;
	        }
	        if(left != -1) {
                if(right - left >= max_diff) {
                    max_diff = right - left;
                    high = right;
                    low = left;
                }
            }
	    }
	    if(high==-1) cout<<-1<<endl;
	    else cout<<low<<" "<<high<<endl;
	}
 
}