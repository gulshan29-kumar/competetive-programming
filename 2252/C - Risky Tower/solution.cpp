#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
   int t;
   cin>>t;
   while(t--){
       int a,b;
       cin>>a>>b;
       long long arr[a];
       for(int i=0;i<a;i++) cin>>arr[i];
       map<long ,long > map1;
       long long ans=b;
       long long min1=1e12;
       long long grid[a][b];
       for(int i=0;i<a;i++){
           for(int j=0;j<b;j++) cin>>grid[i][j];
       }
       for(int i=a-1;i>=0;i--){
           for(int j=0;j<b;j++){
               map1[grid[i][j]]++;
           }
           long long  freq=0;
           long long sum=0;
           for(auto it=map1.rbegin();it!=map1.rend()&&freq<b;++it){
               int freqt=it->second;
               while(freqt>0&&freq<b){
                   sum+=it->first;
                   freqt--;
                   freq++;
                   if(sum>=arr[i]) {
                       ans=min(ans,freq);
                       break;
                   }
               }
               if(sum>=arr[i]) break;
           }
           min1=min(min1,arr[i]);
       }
       cout<<ans<<endl;
       
   }
}