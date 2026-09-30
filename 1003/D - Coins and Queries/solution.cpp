#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int a,b;
	cin>>a>>b;
    long long maxi=0;
    unordered_map<int,int> map1;
    for(int i=0;i<a;i++){
       long long d;
        cin>>d;
        map1[d]++;
        maxi=max(maxi,d);
        
    }
    map1[0]=1;
    for(int i=0;i<b;i++){
       int q;
        cin>>q;
        int coin=0;
        int currmax=maxi;
        while(currmax!=0&&q!=0){
            int mini=min(map1[currmax],q/currmax);
            coin+=mini;
            q-=mini*currmax;
            int curr=currmax/2;
            while(map1.find(curr)==map1.end()){
                curr=curr/2;
            }
            currmax=curr;
        }
        if(q!=0) cout<<-1<<endl;
        else cout<<coin<<endl;
    }
    cout<<endl;
	
}