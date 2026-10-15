#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        string str;
        cin>>str;
        int cnt=1;
        int a=str.size();
        int ans=1;
        set<int> set;
        for(int i=1;i<a;i++){
            if(str[i]==str[i-1]) cnt++;
            else{
                if(i==1) continue ;
                if(cnt==1) set.insert(cnt);
                else if(cnt>=3) set.insert(3);
                cnt=1;
            }
        }
        if(cnt>=3) set.insert(3);
        cout<<ans+set.size()<<endl;
       
    }
}