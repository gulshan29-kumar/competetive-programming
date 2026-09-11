#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    map<int,int> map1;
	    int maxfreq=0;
	    for(int i=0;i<a;i++){
	        int d;
	        cin>>d;
	        map1[d]++;
	        maxfreq=max(maxfreq,map1[d]);
	    }
	    int req=a-maxfreq+2;
	    int sum=0;
	    for(auto it:map1){
	        if(it.second==maxfreq&&maxfreq>req){
	            sum+=it.first*req;
	        }
	        else sum+=it.first*it.second;
	    }
	    cout<<sum<<endl;
	}
 
}