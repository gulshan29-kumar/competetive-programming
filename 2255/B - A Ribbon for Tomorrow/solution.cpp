#include <bits/stdc++.h>
using namespace std;
const long long  mod=998244353;
const int maxlen=1000000;
long long  fact[maxlen+1];
long long  invfact[maxlen+1];
int power(long long  no,long long  b){
    long long  ans=1;
    while(b>0){
        if(b&1) ans=(ans*no)%mod;
        no=(no*no)%mod;
        b=b>>1;
    }
    return ans;
}
 
int main() {
	// your code goes here
	fact[0]=1;
	for(int i=1;i<=maxlen;i++){
	    fact[i]=(fact[i-1]*i)%mod;
	}
	invfact[maxlen]=power(fact[maxlen],mod-2);
	for(int i=maxlen;i>0;i--){
	    invfact[i-1]=(invfact[i]*i)%mod;
	}
	int t;
	cin>>t;
	while(t--){
	    int a;
	    cin>>a;
	    string str;
	    cin>>str;
	    int cnt0=0;
	    int cnt1=0;
	    int seg0=0;
	    int seg1=0;
	    for(int i=0;i<a;i++){
	        if(str[i]=='0'){
	            cnt0++;
	            if(i==0||str[i-1]=='1') seg0++;
	        }
	        else {
	            cnt1++;
	            if(i==0||str[i-1]=='0') seg1++;
	        }
	    }
	    long long  ways=1;
	    long long  ways2=1;
	    if(cnt1) ways=(fact[cnt1-1]*invfact[seg1-1]%mod*invfact[cnt1-seg1])%mod;
	    if(cnt0)  ways2=(fact[cnt0-1]*invfact[seg0-1]%mod*invfact[cnt0-seg0])%mod;
	    long long  ans=(ways*ways2)%mod;
	    cout<<ans<<endl;
	}
	
             
}