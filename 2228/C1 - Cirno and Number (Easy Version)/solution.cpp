#include <bits/stdc++.h>
using namespace std;
vector<long long > vec[100];
void generate(int len,long long num,long long  c,long long  d){
    vec[10*c+d].push_back(num);
    if(len==17) return;
    generate(len+1,num*10+c,c,d);
    generate(len+1,num*10+d,c,d);
}
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	  long long a,n;
	  cin>>a>>n;
	  long long c,d;
	  cin>>c>>d;
	  if(vec[10*c+d].empty()){
	      generate(0,c,c,d);
	      generate(0,d,c,d);
	      sort(vec[10*c+d].begin(),vec[10*c+d].end());
	  }
	  auto idx=lower_bound(vec[10*c+d].begin(), vec[10*c+d].end(), a);
	  long long ans=3e18;
	  if(idx!=vec[10*c+d].end()) ans=min(ans,*idx-a);
	  if(idx!=vec[10*c+d].begin()) ans=min(ans,a-*(--idx));
	 cout<<ans<<endl;
	}
 
	
 
}