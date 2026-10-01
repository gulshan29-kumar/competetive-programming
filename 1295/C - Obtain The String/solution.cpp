#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    string str1,str2;
	    cin>>str1>>str2;
	    vector<int> arr[27];
	    for(int i=0;i<str1.size();i++){
	        arr[str1[i]-'a'].push_back(i);
	    }
	    int ans=1;
	    int j=0;
	    int maxi=-1;
	    bool poss=true;
	    while(j<str2.size()){
	        char ch=str2[j];
	        int val=ch-'a';
	        int idx=lower_bound(arr[val].begin(),arr[val].end(),maxi)-arr[val].begin();
	        int val2=-1;
	        if(idx<arr[val].size()) val2=arr[val][idx];
	        if(arr[val].size()==0) {
	            poss=false;
	            break;
	        }
	        if(val2>maxi) maxi=val2;
	        else if(val2==maxi&&idx+1<arr[val].size()){
	            maxi=arr[val][idx+1];
	        }
	        else{
	           ans++;
	           maxi=arr[val][0];
	        }
	        j++;
	    }
	    if(!poss) cout<<-1<<endl;
	    else cout<<ans<<endl;
	}
 
}