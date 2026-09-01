#include <bits/stdc++.h>
using namespace std;
long long ans(long long no,long long  cnt,long long target, map<long long,long long>& map){
    if(no==target) return cnt;
    if(no<target) return LLONG_MAX;
    if(map.find(no)!=map.end()) return map[no];
     map[no]=min(ans(no/2,cnt+1,target,map),ans(no-no/2,cnt+1,target,map));
    return map[no];
}
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	  long long a,b;
	  cin>>a>>b;
	  map<long long,long long> map;
	  long long ans1=ans(a,0,b,map);
	  if(ans1==LLONG_MAX) cout<<-1<<endl;
	  else cout<<ans1<<endl;
      
	}
 
}