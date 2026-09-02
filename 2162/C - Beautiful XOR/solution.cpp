#include <bits/stdc++.h>
 
using namespace std;
 
int main() {
    // your code goes here
    int t;
    cin >> t;
    while (t--> 0) {
        long long a,b;
        cin>>a>>b;
        long long cnt=log2(a);
        long long cnt2=log2(b);
        if(cnt2>cnt){
            cout<<-1<<endl;
            continue;
        }
       
        vector<long long > ans;
        if(cnt==cnt2){
            ans.push_back(a^(1<<(cnt)));
            b=b^(1<<(cnt2));
            int po=1;
            while(b!=0){
                if(b&po){
                    b=b^po;
                    ans.push_back(po);
                }
                po=po<<1;
            }
        }
        else{
            ans.push_back(a^(1LL<<(cnt)));
            int po=1;
             while(b!=0){
                if(b&po){
                    b=b^po;
                    ans.push_back(po);
                }
                po=po<<1;
            }
            ans.push_back(1<<cnt);
        }
        cout<<ans.size()<<endl;
        for(long long it:ans) cout<<it<<" ";
        cout<<endl;
    }
 
}