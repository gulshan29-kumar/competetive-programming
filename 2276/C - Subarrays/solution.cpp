#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int a,k;
        cin>>a>>k;
        long long ans=0;
        map<long long ,vector<int>> freqmap;
        freqmap[0]={-1};
        long long sum=0;
        for(int i=0;i<a;i++){
            int d;
            cin>>d;
            sum+=d;
            int target=sum%k;
            if(freqmap.find(target)!=freqmap.end()){
                int target2=i-k;
                freqmap[target].push_back(i);
                int up=lower_bound(freqmap[target].begin(),freqmap[target].end(),target2)-freqmap[target].begin();
                ans+=up;
            }
            else freqmap[target].push_back(i);
        }
        cout<<ans<<endl;
       
    }
}